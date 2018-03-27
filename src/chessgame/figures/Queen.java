package chessgame.figures;

import chessgame.*;

public class Queen extends Figure {

    public Queen(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.QUEEN;
    }

    @Override
    public Iterable<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "Q";
    }
}
