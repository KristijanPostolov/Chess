package chessgame.figures;

import chessgame.*;

public class King extends Figure {

    public King(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.KING;
    }

    @Override
    public Iterable<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "K";
    }
}
