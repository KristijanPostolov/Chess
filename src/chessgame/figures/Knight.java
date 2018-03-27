package chessgame.figures;

import chessgame.*;

import java.util.Collection;

public class Knight extends Figure {

    public Knight(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.KNIGHT;
    }

    @Override
    public Collection<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "N";
    }
}
