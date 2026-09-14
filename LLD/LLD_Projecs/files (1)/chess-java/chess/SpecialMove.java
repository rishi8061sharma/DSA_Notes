package chess;

/**
 * The special, rule-bending moves. Kept as an enum for fidelity to the class
 * diagram. PAWN_PROMOTION is implemented (auto-queen) in Game; CASTLING and
 * EN_PASSANT are left as documented extension points (each needs extra state:
 * king/rook "has moved" flags for castling, and the previous move for en passant
 * the Piece.hasMoved flag and Game.history list below already provide the hooks).
 */
public enum SpecialMove {
    CASTLING,
    EN_PASSANT,
    PAWN_PROMOTION
}
