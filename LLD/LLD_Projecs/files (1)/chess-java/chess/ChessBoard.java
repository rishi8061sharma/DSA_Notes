package chess;

/**
 * The 8x8 grid. Here a 2D array IS correct (unlike the Snake & Ladder board,
 * which was a 1-D run of 100 cells). The board is the authority on what sits
 * where, and offers the queries the rules engine needs.
 */
public class ChessBoard {

    private final Cell[][] cells = new Cell[8][8];

    public ChessBoard() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Color squareColor = ((r + c) % 2 == 0) ? Color.BLACK : Color.WHITE; // a1 is dark
                cells[r][c] = new Cell(new Position(r, c), squareColor);
            }
        }
    }

    public Cell getCell(Position p) { return cells[p.getRow()][p.getCol()]; }

    public Piece getPiece(Position p) { return cells[p.getRow()][p.getCol()].getPiece(); }

    public void setPiece(Position p, Piece piece) { cells[p.getRow()][p.getCol()].setPiece(piece); }

    public boolean isEmpty(Position p) { return getPiece(p) == null; }

    /** Place all 32 pieces in their standard starting positions. */
    public void setupStandard() {
        for (int c = 0; c < 8; c++) {
            setPiece(new Position(1, c), new Pawn(Color.WHITE));
            setPiece(new Position(6, c), new Pawn(Color.BLACK));
        }
        placeBackRank(0, Color.WHITE);
        placeBackRank(7, Color.BLACK);
    }

    private void placeBackRank(int row, Color color) {
        setPiece(new Position(row, 0), new Rook(color));
        setPiece(new Position(row, 1), new Knight(color));
        setPiece(new Position(row, 2), new Bishop(color));
        setPiece(new Position(row, 3), new Queen(color));
        setPiece(new Position(row, 4), new King(color));
        setPiece(new Position(row, 5), new Bishop(color));
        setPiece(new Position(row, 6), new Knight(color));
        setPiece(new Position(row, 7), new Rook(color));
    }

    public Position findKing(Color color) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = cells[r][c].getPiece();
                if (p instanceof King && p.getColor() == color) {
                    return new Position(r, c);
                }
            }
        }
        return null;
    }

    /**
     * Is `target` attacked by any piece of colour `byColor`? Used for check
     * detection. Because the king occupies the target square when we test it,
     * pawns correctly generate their diagonal attack onto it.
     */
    public boolean isUnderAttack(Position target, Color byColor) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = cells[r][c].getPiece();
                if (p != null && p.getColor() == byColor) {
                    if (p.getPseudoLegalMoves(this, new Position(r, c)).contains(target)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /** Simple text rendering, rank 8 at the top; black pieces are lowercase. */
    public String render() {
        StringBuilder sb = new StringBuilder();
        for (int r = 7; r >= 0; r--) {
            sb.append(r + 1).append("  ");
            for (int c = 0; c < 8; c++) {
                Piece p = cells[r][c].getPiece();
                char ch = '.';
                if (p != null) {
                    ch = p.symbol().charAt(0);
                    if (p.getColor() == Color.BLACK) ch = Character.toLowerCase(ch);
                }
                sb.append(ch).append(' ');
            }
            sb.append('\n');
        }
        sb.append("   a b c d e f g h\n");
        return sb.toString();
    }
}
