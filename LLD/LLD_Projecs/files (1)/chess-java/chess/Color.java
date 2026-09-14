package chess;

/** The two sides. A fixed set of labels, so this is an enum (not a class). */
public enum Color {
    WHITE,
    BLACK;

    public Color opposite() {
        return this == WHITE ? BLACK : WHITE;
    }
}
