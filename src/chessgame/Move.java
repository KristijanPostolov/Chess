package chessgame;

public class Move {

    public final Figure figure;
    public final Position from;
    public final Position to;

    public Move(Figure figure, Position from, Position to) {
        this.figure = figure;
        this.from = from;
        this.to = to;
    }

    public void applyOn(Figure board[][]) {
        board[to.rank][to.column] = board[from.rank][from.column];
        board[from.rank][from.column] = null;
    }

}
