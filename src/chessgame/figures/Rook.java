package chessgame.figures;

import chessgame.*;

public class Rook extends Figure {

    public Rook(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.ROOK;
    }

    @Override
    public Iterable<Move> possibleMoves(GameState state, Position from) {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + "R";
    }
}
