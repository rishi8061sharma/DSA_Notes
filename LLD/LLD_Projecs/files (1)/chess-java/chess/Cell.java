package chess;

/**
 * One square of the board. It OWNS its position (composition) but only
 * REFERS to whichever piece is standing on it right now (association) -- the
 * piece belongs to a player and moves from square to square, so the reference
 * is temporary and may be null.
 */
public class Cell {

    private final Position position;
    private final Color color;   // the square's colour (light/dark)
    private Piece piece;         // occupant, or null if empty

    public Cell(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public Position getPosition() { return position; }

    public Color getColor() { return color; }

    public Piece getPiece() { return piece; }

    public void setPiece(Piece piece) { this.piece = piece; }

    public boolean isEmpty() { return piece == null; }
}
