package chess;

import java.util.List;

public class Queen extends Piece {

    private static final int[][] DIRS = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1},      // straight
        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}     // diagonal
    };

    public Queen(Color color) { super(color); }

    @Override
    public String symbol() { return "Q"; }

    @Override
    public List<Position> getPseudoLegalMoves(ChessBoard board, Position from) {
        return slide(board, from, DIRS);
    }
}
