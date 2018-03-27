package chessgame;

import chessgame.figures.*;

public class BoardBuilder {

    private Board board;

    public BoardBuilder(int height, int width) {
        board = new Board(new Figure[height][width]);
    }

    public Board build() {
        return board;
    }

    public BoardBuilder addPiece(Figure figure, int rank, int column) {
        board.setAt(rank, column, figure);
        return this;
    }

    public BoardBuilder addKing(int rank, int column, Color color) {
        return addPiece(new King(color), rank, column);
    }

    public BoardBuilder addQueen(int rank, int column, Color color) {
        return addPiece(new Queen(color), rank, column);
    }

    public BoardBuilder addRook(int rank, int column, Color color) {
        return addPiece(new Rook(color), rank, column);
    }

    public BoardBuilder addKnight(int rank, int column, Color color) {
        return addPiece(new Knight(color), rank, column);
    }

    public BoardBuilder addBishop(int rank, int column, Color color) {
        return addPiece(new Bishop(color), rank, column);
    }

    public BoardBuilder addPawn(int rank, int column, Color color) {
        return addPiece(new Pawn(color), rank, column);
    }

}
