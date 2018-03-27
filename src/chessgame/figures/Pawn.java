package chessgame.figures;

import chessgame.*;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends Figure {

    public Pawn(Color figureColor) {
        super(figureColor);
    }

    @Override
    public FigureType getFigureType() {
        return FigureType.PAWN;
    }

    @Override
    public Iterable<Move> possibleMoves(GameState state, Position from) {
        int width = state.getWigth();
        int height = state.getHeight();
        int x = from.getX();
        int y = from.getY();
        Set<Position> moves = new HashSet<>();
        if(state.layout[y + 1][x] == null) {
            // TODO: Convert to Queen
            moves.add(new Position(x, y + 1));
        }
        // TODO: Check in board
        if(state.layout[y + 1][x + 1] != null && state.layout[y + 1][x + 1].getFigureColor() != state.playerTurn) {
            moves.add(new Position(x + 1, y + 1));
        }
        if(state.layout[y + 1][x - 1] != null && state.layout[y + 1][x - 1].getFigureColor() != state.playerTurn) {
            moves.add(new Position(x - 1, y + 1));
        }
        // TODO: en passant
        return moves;
    }

    @Override
    public String toString() {
        return super.toString() + "P";
    }
}
