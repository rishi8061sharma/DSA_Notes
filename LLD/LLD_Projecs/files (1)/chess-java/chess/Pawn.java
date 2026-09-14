package chess;

import java.util.ArrayList;
import java.util.List;

/**
 * The pawn is the only piece whose moves depend on its colour (direction) and
 * whose capture squares differ from its move squares -- which is exactly why a
 * shared helper won't do and it overrides getPseudoLegalMoves fully.
 */
public class Pawn extends Piece {

    public Pawn(Color color) { super(color); }

    @Override
    public String symbol() { return "P"; }

    @Override
    public List<Position> getPseudoLegalMoves(ChessBoard board, Position from) {
        List<Position> moves = new ArrayList<>();
        int dir = (color == Color.WHITE) ? 1 : -1;        // white goes up the board
        int startRow = (color == Color.WHITE) ? 1 : 6;
        int r = from.getRow();
        int c = from.getCol();

        // forward one (only onto an empty square)
        int oneR = r + dir;
        if (Position.isValid(oneR, c) && board.isEmpty(new Position(oneR, c))) {
            moves.add(new Position(oneR, c));
            // forward two from the starting row (both squares must be empty)
            int twoR = r + 2 * dir;
            if (r == startRow && board.isEmpty(new Position(twoR, c))) {
                moves.add(new Position(twoR, c));
            }
        }

        // diagonal captures (only onto an enemy-occupied square)
        for (int dc : new int[]{-1, 1}) {
            int cr = r + dir;
            int cc = c + dc;
            if (!Position.isValid(cr, cc)) continue;
            Piece occ = board.getPiece(new Position(cr, cc));
            if (occ != null && occ.getColor() != color) {
                moves.add(new Position(cr, cc));
            }
        }
        return moves;
    }
}
