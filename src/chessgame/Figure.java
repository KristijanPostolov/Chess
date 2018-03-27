package chessgame;

import java.util.Objects;

public abstract class Figure implements Movable {

    public enum FigureType {
        KING,
        QUEEN,
        ROOK,
        KNIGHT,
        BISHOP,
        PAWN
    }

    private static int U_ID = 1;

    private final int id;
    private final Color figureColor;

    public Figure(Color figureColor) {
        this.figureColor = figureColor;
        id = U_ID++;
    }

    public abstract FigureType getFigureType();

    public Color getFigureColor() {
        return figureColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Figure figure = (Figure) o;
        return id == figure.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return figureColor.name().substring(0,1);
    }
}
