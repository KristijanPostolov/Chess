package chessgame.figures;

import chessgame.*;

import java.util.Collection;

public class Queen extends Figure {

    public Queen(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.QUEEN;
    }

    @Override
    public Collection<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Q";
    }
}
