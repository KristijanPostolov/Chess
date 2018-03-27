package chessgame;

public class Board {

    private final Figure layout[][];
    public final int height;
    public final int width;

    public Board(Figure[][] layout) {
        this.layout = layout;
        height = layout.length;
        width = layout[0].length;
    }

    public boolean valid(Position p) {
        return (p.rank >= 0) && (p.rank < height) && (p.column >= 0) && (p.column < width);
    }

    public Figure get(Position p) {
        return layout[p.rank][p.column];
    }

    public Figure get(int rank, int column) {
        return get(new Position(rank, column));
    }

    public void setAt(Position p, Figure figure) {
        layout[p.rank][p.column] = figure;
    }

    public void setAt(int rank, int column, Figure figure) {
        setAt(new Position(rank, column), figure);
    }

    public boolean isFree(Position p) {
        return get(p) == null;
    }

    public boolean isFriendly(Position p, Color color) {
        return !isFree(p) && get(p).getFigureColor() == color;
    }

    public boolean isOpponent(Position p, Color color) {
        return !isFree(p) && get(p).getFigureColor() != color;
    }

    public boolean isFreeOrOpponent(Position p, Color color) {
        return isFree(p) || isOpponent(p, color);
    }

}
