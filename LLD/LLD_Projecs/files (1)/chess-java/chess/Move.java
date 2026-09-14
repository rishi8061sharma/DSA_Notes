package chess;

/** An immutable record of one move; the Game keeps a list of these as history. */
public class Move {

    private final Position from;
    private final Position to;
    private final Piece piece;        // the piece that moved
    private final Piece captured;     // the piece removed, or null
    private final boolean promotion;

    public Move(Position from, Position to, Piece piece, Piece captured, boolean promotion) {
        this.from = from;
        this.to = to;
        this.piece = piece;
        this.captured = captured;
        this.promotion = promotion;
    }

    public Position getFrom() { return from; }

    public Position getTo() { return to; }

    public Piece getPiece() { return piece; }

    public Piece getCaptured() { return captured; }

    public boolean isPromotion() { return promotion; }

    @Override
    public String toString() {
        String s = piece.symbol() + from + (captured != null ? "x" : "-") + to;
        if (promotion) s += "=Q";
        return s;
    }
}
