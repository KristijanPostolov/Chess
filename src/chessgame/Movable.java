package chessgame;

public interface Movable {

    // TODO: Should return Move-s. Easier castle, en passant and convert to queen
    Iterable<Move> possibleMoves(GameState state, Position from);

}
