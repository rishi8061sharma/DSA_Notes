package chess;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base for every chess piece. This is the polymorphism payoff of the
 * design: all pieces share colour and a "has moved" flag, but each subclass
 * answers getPseudoLegalMoves() its own way. Code elsewhere holds a Piece and
 * calls that method without caring which kind it is.
 *
 * "Pseudo-legal" = the squares the piece could move to by its movement rules and
 * board occupancy, BEFORE checking whether the move leaves its own king in check.
 * Game applies that final filter.
 */
public abstract class Piece {

    protected final Color color;
    protected boolean hasMoved = false;

    protected Piece(Color color) {
        this.color = color;
    }

    public Color getColor() { return color; }

    public boolean hasMoved() { return hasMoved; }

    public void setMoved(boolean moved) { this.hasMoved = moved; }

    /** Single uppercase letter identifying the piece type (N = knight). */
    public abstract String symbol();

    /** The squares this piece can reach from `from`, ignoring self-check. */
    public abstract List<Position> getPseudoLegalMoves(ChessBoard board, Position from);

    /** Sliding movement (rook/bishop/queen): walk each direction until blocked. */
    protected List<Position> slide(ChessBoard board, Position from, int[][] dirs) {
        List<Position> moves = new ArrayList<>();
        for (int[] d : dirs) {
            int r = from.getRow() + d[0];
            int c = from.getCol() + d[1];
            while (Position.isValid(r, c)) {
                Position to = new Position(r, c);
                Piece occ = board.getPiece(to);
                if (occ == null) {
                    moves.add(to);                       // empty -> can move, keep sliding
                } else {
                    if (occ.getColor() != color) moves.add(to); // enemy -> capture, then stop
                    break;                                // blocked either way
                }
                r += d[0];
                c += d[1];
            }
        }
        return moves;
    }

    /** Single-step movement (king/knight): each offset is one candidate square. */
    protected List<Position> step(ChessBoard board, Position from, int[][] offsets) {
        List<Position> moves = new ArrayList<>();
        for (int[] o : offsets) {
            int r = from.getRow() + o[0];
            int c = from.getCol() + o[1];
            if (!Position.isValid(r, c)) continue;
            Position to = new Position(r, c);
            Piece occ = board.getPiece(to);
            if (occ == null || occ.getColor() != color) moves.add(to);
        }
        return moves;
    }
}
