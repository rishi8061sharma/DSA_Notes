package chess;

/**
 * A participant. A player HAS a colour and a name. Their pieces live on the
 * board (the board is the single source of truth for where pieces are), so we
 * don't duplicate a piece list here -- avoiding the two-places-to-update bug.
 */
public class Player {

    private final String name;
    private final Color color;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() { return name; }

    public Color getColor() { return color; }
}
