package chess;

/** Overall state of the game at any point. */
public enum GameStatus {
    ONGOING,
    CHECK,
    CHECKMATE,
    STALEMATE
}
