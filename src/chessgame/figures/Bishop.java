package chessgame.figures;

import chessgame.*;

import java.util.Collection;

public class Bishop extends Figure {

    public Bishop(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.PAWN;
    }

    @Override
    public Collection<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "B";
    }
}
