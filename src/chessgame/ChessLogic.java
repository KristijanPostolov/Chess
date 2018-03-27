package chessgame;

import chessgame.figures.*;

import java.util.HashSet;
import java.util.Set;

public class ChessLogic {

    public static boolean inBoard(int x, int y, int width, int height) {
        return (x >= 0) && (x < width) && (y >= 0) && (y < height);
    }

    public static GameState getInitialState() {
        int width = 8;
        int height = 8;
        Figure layout[][] = new Figure[height][width];
        for(int j = 0; j < width; j++) {
            layout[1][j] = new Pawn(Color.WHITE);
            layout[height - 2][j] = new Pawn(Color.BLACK);
        }
        layout[0][0] = new Rook(Color.WHITE);
        layout[0][1] = new Knight(Color.WHITE);
        layout[0][2] = new Bishop(Color.WHITE);
        layout[0][3] = new Queen(Color.WHITE);
        layout[0][4] = new King(Color.WHITE);
        layout[0][5] = new Bishop(Color.WHITE);
        layout[0][6] = new Knight(Color.WHITE);
        layout[0][7] = new Rook(Color.WHITE);

        layout[height - 1][0] = new Rook(Color.BLACK);
        layout[height - 1][1] = new Knight(Color.BLACK);
        layout[height - 1][2] = new Bishop(Color.BLACK);
        layout[height - 1][3] = new Queen(Color.BLACK);
        layout[height - 1][4] = new King(Color.BLACK);
        layout[height - 1][5] = new Bishop(Color.BLACK);
        layout[height - 1][6] = new Knight(Color.BLACK);
        layout[height - 1][7] = new Rook(Color.BLACK);
        return new GameState(Color.WHITE, layout, new HashSet<Figure>(), null);
    }

    public static GameState executeMove(GameState state, Move move) {
        int height = state.getHeight();
        int width = state.getWigth();
        Figure newLayout[][] = new Figure[height][width];
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                newLayout[i][j] = state.layout[i][j];
            }
        }
        Set<Figure> newMoved = new HashSet<>(state.moved);
        calculateLayout(newLayout, newMoved, move);
        Color playerTurn = nextPlayer(state.playerTurn);
        return new GameState(playerTurn, newLayout, newMoved, move);
    }

    private static void calculateLayout(Figure board[][], Set<Figure> moved, Move move) {
        if(move.to != null) {
            board[move.to.getX()][move.to.getY()] = board[move.from.getX()][move.from.getY()];
            moved.add(move.figure);
        }
        board[move.from.getX()][move.from.getY()] = null;
        if(move.associatedMove != null) {
            calculateLayout(board, moved, move.associatedMove);
        }
    }

    private static Color nextPlayer(Color player) {
        if(player == Color.WHITE) {
            return Color.BLACK;
        }else {
            return Color.WHITE;
        }
    }

    private static Position getKingPosition(Figure layout[][], Color player) {
        int height = layout.length;
        int width = layout[0].length;
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                if(layout[i][j].getFigureType() == Figure.FigureType.KING && layout[i][j].getFigureColor() == player) {
                    return new Position(j, i);
                }
            }
        }
        return null;
    }

}
