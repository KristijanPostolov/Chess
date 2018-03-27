package chessgame;

import java.util.Set;

public class GameState {

    public final Color playerTurn;
    public final Figure layout[][];
    public final Set<Figure> moved;
    public final Move lastMove;

    public GameState(Color playerTurn, Figure[][] layout, Set<Figure> moved, Move lastMove) {
        this.playerTurn = playerTurn;
        this.layout = layout;
        this.moved = moved;
        this.lastMove = lastMove;
    }

    public int getWigth() {
        return layout[0].length;
    }

    public int getHeight() {
        return layout.length;
    }

}
