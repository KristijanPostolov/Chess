package chessgame.figures;

import chessgame.*;

import java.util.Collection;

public class King extends Figure {

    public King(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.KING;
    }

    @Override
    public Collection<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "K";
    }
}
