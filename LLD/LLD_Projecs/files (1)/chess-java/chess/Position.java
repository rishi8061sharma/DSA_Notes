package chess;

/**
 * A square's coordinate. Unlike Snake & Ladder (where a position was a single
 * number), a chess square needs two coordinates, so Position earns its own class.
 * row 0..7 maps to ranks 1..8; col 0..7 maps to files a..h.
 */
public final class Position {

    private final int row;
    private final int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }

    public int getCol() { return col; }

    public static boolean isValid(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    public boolean isValid() {
        return isValid(row, col);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position p = (Position) o;
        return row == p.row && col == p.col;
    }

    @Override
    public int hashCode() {
        return row * 8 + col;
    }

    /** Algebraic notation, e.g. (3,4) -> "e4". */
    @Override
    public String toString() {
        return "" + (char) ('a' + col) + (row + 1);
    }
}
