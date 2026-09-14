# Chess — System Design in Java

A faithful Java implementation of the chess class diagram. Each box in the
diagram is one class; the relationships (inheritance, composition, aggregation,
association) are realized directly in the code.

## Build & run

No external dependencies. With a JDK installed:

```bash
javac -d out chess/*.java
java -cp out chess.Main
```

`Main` plays "Fool's mate" and prints the board, each move, and the final
`CHECKMATE` status to show the rules engine working.

## Classes

| Class / enum   | Role                                                                 |
|----------------|----------------------------------------------------------------------|
| `Game`         | Referee: turn order, legal-move filtering, move execution, end states |
| `ChessBoard`   | 8x8 grid of `Cell`s; setup, queries, attack detection, rendering      |
| `Cell`         | One square: owns a `Position`, refers to the `Piece` on it (or null)  |
| `Position`     | (row, col) coordinate with algebraic `toString` (e.g. "e4")          |
| `Piece` (abstract) | Shared colour + `getPseudoLegalMoves()` each subclass overrides  |
| `King` … `Pawn`| The six concrete pieces, each with its own movement                  |
| `Move`         | Immutable record of one move (from, to, piece, captured, promotion)  |
| `Player`       | Name + colour                                                        |
| `Color`        | enum WHITE / BLACK                                                   |
| `GameStatus`   | enum ONGOING / CHECK / CHECKMATE / STALEMATE                         |
| `SpecialMove`  | enum CASTLING / EN_PASSANT / PAWN_PROMOTION                          |

## Key design decisions

- **Piece is a class hierarchy, not an enum.** Inheritance + an overridden
  `getPseudoLegalMoves()` is how each piece gets its own movement — the
  polymorphism at the centre of the design.
- **The board is the single source of truth** for where pieces are, so piece
  positions aren't duplicated on `Player` (avoids sync bugs).
- **Pseudo-legal vs legal.** Pieces generate moves by their own rules;
  `Game` removes any move that leaves the mover's king in check. That single
  filter is what makes check, checkmate, and stalemate detection correct.

## Implemented vs. extension points

Implemented: all piece movement, captures, check, checkmate, stalemate,
turn handling, move history, and pawn promotion (auto-queen).

Left as documented hooks (state is already present to add them): castling
(uses `Piece.hasMoved`) and en passant (uses `Game.history`). Promotion choice
is fixed to queen for simplicity.
