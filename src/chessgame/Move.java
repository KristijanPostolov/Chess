package chessgame;

public class Move {

    public final Figure figure;
    public final Position from;
    public final Position to;
    public final Move associatedMove;

    public Move(Figure figure, Position from, Position to) {
        this(figure, from, to, null);
    }

    public Move(Figure figure, Position from, Position to, Move associatedMove) {
        this.figure = figure;
        this.from = from;
        this.to = to;
        this.associatedMove = associatedMove;
    }

}
