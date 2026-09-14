package chess;

import java.util.List;

public class Bishop extends Piece {

    private static final int[][] DIRS = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    public Bishop(Color color) { super(color); }

    @Override
    public String symbol() { return "B"; }

    @Override
    public List<Position> getPseudoLegalMoves(ChessBoard board, Position from) {
        return slide(board, from, DIRS);
    }
}
