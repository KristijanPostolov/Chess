package chessgame;

import java.util.Collection;

public interface Movable {

    Collection<Move> possibleMoves(GameState state, Position from);

}
