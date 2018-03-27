package chessgame;

import java.util.Set;

public class GameState {

    public final Color playerTurn;
    public final Board board;
    public final Set<Figure> moved;
    public final Move lastMove;

    public GameState(Color playerTurn, Figure[][] layout, Set<Figure> moved, Move lastMove) {
        this(playerTurn, new Board(layout), moved, lastMove);
    }

    public GameState(Color playerTurn, Board board, Set<Figure> moved, Move lastMove) {
        this.playerTurn = playerTurn;
        this.board = board;
        this.moved = moved;
        this.lastMove = lastMove;
    }

}
