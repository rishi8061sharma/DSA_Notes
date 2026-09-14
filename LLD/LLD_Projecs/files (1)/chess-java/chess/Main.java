package chess;

/**
 * Small driver. Plays "Fool's mate" -- the fastest checkmate -- so you can watch
 * the engine reject illegal moves and detect checkmate at the end.
 */
public class Main {

    private static Position pos(String sq) {
        int col = sq.charAt(0) - 'a';
        int row = sq.charAt(1) - '1';
        return new Position(row, col);
    }

    private static void move(Game g, String from, String to) {
        boolean ok = g.makeMove(pos(from), pos(to));
        System.out.printf("%s-%s  %s  status=%s%n",
                from, to, ok ? "ok" : "ILLEGAL", g.getStatus());
    }

    public static void main(String[] args) {
        Game g = new Game("White", "Black");
        System.out.println("Starting position:");
        System.out.println(g.getBoard().render());

        // Fool's mate
        move(g, "f2", "f3");
        move(g, "e7", "e5");
        move(g, "g2", "g4");
        move(g, "d8", "h4");   // Qh4#

        System.out.println("\nFinal position:");
        System.out.println(g.getBoard().render());

        System.out.println("Status : " + g.getStatus());
        if (g.getWinner() != null) {
            System.out.println("Winner : " + g.getWinner().getName()
                    + " (" + g.getWinner().getColor() + ")");
        }
        System.out.print("History: ");
        for (Move m : g.getHistory()) System.out.print(m + " ");
        System.out.println();
    }
}
