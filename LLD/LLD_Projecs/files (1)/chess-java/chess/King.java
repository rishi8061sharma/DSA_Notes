package chess;

import java.util.List;

public class King extends Piece {

    private static final int[][] OFFSETS = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1},
        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
    };

    public King(Color color) { super(color); }

    @Override
    public String symbol() { return "K"; }

    @Override
    public List<Position> getPseudoLegalMoves(ChessBoard board, Position from) {
        // One square any direction. (Castling would be added here, guarded by
        // hasMoved on king and rook plus "not moving through check" checks.)
        return step(board, from, OFFSETS);
    }
}
