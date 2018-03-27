package chessgame.figures;

import chessgame.*;

public class Knight extends Figure {

    public Knight(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.KNIGHT;
    }

    @Override
    public Iterable<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "N";
    }
}
