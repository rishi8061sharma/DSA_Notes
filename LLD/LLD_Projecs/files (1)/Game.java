package chess;

import java.util.ArrayList;
import java.util.List;

/**
 * The referee. It owns the board (composition), groups the two players
 * (aggregation), tracks whose turn it is and the move history, and holds the
 * rules: turn order, legal-move filtering, move execution, and end detection.
 */
public class Game {

    private final ChessBoard board = new ChessBoard();
    private final List<Player> players = new ArrayList<>();
    private Player currentPlayer;
    private Player winner;
    private GameStatus status = GameStatus.ONGOING;
    private final List<Move> history = new ArrayList<>();

    public Game(String whiteName, String blackName) {
        players.add(new Player(whiteName, Color.WHITE));
        players.add(new Player(blackName, Color.BLACK));
        currentPlayer = players.get(0);     // White moves first
        board.setupStandard();
    }

    public ChessBoard getBoard() { return board; }

    public GameStatus getStatus() { return status; }

    public Player getCurrentPlayer() { return currentPlayer; }

    public Player getWinner() { return winner; }

    public List<Move> getHistory() { return history; }

    /**
     * Fully-legal destinations for the piece on `from`: pseudo-legal moves minus
     * any that would leave the mover's own king in check.
     */
    public List<Position> getLegalMoves(Position from) {
        List<Position> legal = new ArrayList<>();
        Piece p = board.getPiece(from);
        if (p == null) return legal;
        for (Position to : p.getPseudoLegalMoves(board, from)) {
            if (!leavesKingInCheck(from, to, p.getColor())) {
                legal.add(to);
            }
        }
        return legal;
    }

    /** Simulate from->to, test our king's safety, then undo. */
    private boolean leavesKingInCheck(Position from, Position to, Color color) {
        Piece moving = board.getPiece(from);
        Piece captured = board.getPiece(to);
        board.setPiece(to, moving);
        board.setPiece(from, null);

        boolean inCheck = board.isUnderAttack(board.findKing(color), color.opposite());

        board.setPiece(from, moving);   // undo
        board.setPiece(to, captured);
        return inCheck;
    }

    /**
     * Attempt a move for the current player. Returns false (and changes nothing)
     * if it isn't the player's piece or the move isn't legal.
     */
    public boolean makeMove(Position from, Position to) {
        Piece p = board.getPiece(from);
        if (p == null || p.getColor() != currentPlayer.getColor()) return false;
        if (!getLegalMoves(from).contains(to)) return false;

        Piece captured = board.getPiece(to);
        board.setPiece(to, p);
        board.setPiece(from, null);
        p.setMoved(true);

        boolean promoted = false;
        if (p instanceof Pawn && (to.getRow() == 0 || to.getRow() == 7)) {
            board.setPiece(to, new Queen(p.getColor()));   // auto-promote to queen
            promoted = true;
        }

        history.add(new Move(from, to, p, captured, promoted));
        updateStatusForOpponent();
        switchTurn();
        return true;
    }

    /** After a move, classify the opponent's situation. */
    private void updateStatusForOpponent() {
        Color opp = currentPlayer.getColor().opposite();
        boolean inCheck = board.isUnderAttack(board.findKing(opp), currentPlayer.getColor());
        boolean hasMove = hasAnyLegalMove(opp);

        if (inCheck && !hasMove) {
            status = GameStatus.CHECKMATE;
            winner = currentPlayer;
        } else if (!inCheck && !hasMove) {
            status = GameStatus.STALEMATE;
        } else if (inCheck) {
            status = GameStatus.CHECK;
        } else {
            status = GameStatus.ONGOING;
        }
    }

    public boolean hasAnyLegalMove(Color color) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Position from = new Position(r, c);
                Piece p = board.getPiece(from);
                if (p != null && p.getColor() == color && !getLegalMoves(from).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void switchTurn() {
        if (status == GameStatus.CHECKMATE || status == GameStatus.STALEMATE) return; // game over
        currentPlayer = (currentPlayer == players.get(0)) ? players.get(1) : players.get(0);
    }
}
