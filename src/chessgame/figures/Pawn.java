package chessgame.figures;

import chessgame.*;

import java.util.Collection;
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
    public Collection<Move> possibleMoves(GameState state, Position from) {
        Set<Move> moves = new HashSet<>();
        Board board = state.board;

        Position up = new Position(from.rank + 1, from.column);
        if(board.valid(up) && board.isFree(up)) {
            if(up.rank == board.height - 1) {
                // Promotion moves
                moves.add(new PromotionMove(this, from, up, new Queen(figureColor)));
                moves.add(new PromotionMove(this, from, up, new Rook(figureColor)));
                moves.add(new PromotionMove(this, from, up, new Bishop(figureColor)));
                moves.add(new PromotionMove(this, from, up, new Knight(figureColor)));
            } else {
                // Forward move
                moves.add(new Move(this, from, up));
            }

            Position twoUp = new Position(from.rank + 2, from.column);
            if(!state.moved.contains(this) && board.valid(twoUp) && board.isFree(twoUp)) {
                // Jump one move
                moves.add(new Move(this, from, twoUp));
            }
        }
        Position upLeft = new Position(from.rank + 1, from.column - 1);
        if(board.valid(upLeft) && board.isOpponent(upLeft, figureColor)) {
            // Capture up-left
            moves.add(new Move(this, from, upLeft));
        }
        Position upRight = new Position(from.rank + 1, from.column + 1);
        if(board.valid(upRight) && board.isOpponent(upRight, figureColor)) {
            // Capture up-right
            moves.add(new Move(this, from, upRight));
        }
        // TODO: En passant

        return moves;
    }

    @Override
    public String toString() {
        return super.toString() + "P";
    }
}
