package chessgame;

import java.util.Objects;

public class Position {

    public final int rank;
    public final int column;

    public Position(int rank, int column) {
        this.rank = rank;
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return rank == position.rank && column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, column);
    }

    @Override
    public String toString() {
        return String.format("%c%d", 'A' + column, rank);
    }
}
