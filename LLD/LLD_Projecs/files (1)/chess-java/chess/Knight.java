package chess;

import java.util.List;

public class Knight extends Piece {

    private static final int[][] OFFSETS = {
        {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
        {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
    };

    public Knight(Color color) { super(color); }

    @Override
    public String symbol() { return "N"; }   // N, since K is the King

    @Override
    public List<Position> getPseudoLegalMoves(ChessBoard board, Position from) {
        return step(board, from, OFFSETS);   // jumps, so it ignores blockers
    }
}
