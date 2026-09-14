package chess;

import java.util.List;

public class Rook extends Piece {

    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public Rook(Color color) { super(color); }

    @Override
    public String symbol() { return "R"; }

    @Override
    public List<Position> getPseudoLegalMoves(ChessBoard board, Position from) {
        return slide(board, from, DIRS);
    }
}
