package chessgame.figures;

import chessgame.*;

import java.util.Collection;

public class Rook extends Figure {

    public Rook(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.ROOK;
    }

    @Override
    public Collection<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "R";
    }
}
