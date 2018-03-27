package chessgame;

import chessgame.figures.*;

import java.util.HashSet;
import java.util.Set;

public class ChessLogic {

    public static GameState getInitialState() {
        int width = 8;
        int height = 8;
        BoardBuilder bb = new BoardBuilder(height, width);
        for(int j = 0; j < width; j++) {
            bb.addPawn(1, j, Color.WHITE);
            bb.addPawn(height - 2, j, Color.BLACK);
        }
        bb.addRook(0, 0, Color.WHITE);
        bb.addKnight(0, 1, Color.WHITE);
        bb.addBishop(0, 2, Color.WHITE);
        bb.addQueen(0, 3, Color.WHITE);
        bb.addKing(0, 4, Color.WHITE);
        bb.addBishop(0, 5, Color.WHITE);
        bb.addKnight(0, 6, Color.WHITE);
        bb.addRook(0, 7, Color.WHITE);

        bb.addRook(height-1, 0, Color.BLACK);
        bb.addKnight(height-1, 1, Color.BLACK);
        bb.addBishop(height-1, 2, Color.BLACK);
        bb.addQueen(height-1, 3, Color.BLACK);
        bb.addKing(height-1, 4, Color.BLACK);
        bb.addBishop(height-1, 5, Color.BLACK);
        bb.addKnight(height-1, 6, Color.BLACK);
        bb.addRook(height-1, 7, Color.BLACK);

        return new GameState(Color.WHITE, bb.build(), new HashSet<>(), null);
    }

    public static GameState executeMove(GameState state, Move move) {
        int height = state.board.height;
        int width = state.board.width;
        Figure newLayout[][] = new Figure[height][width];
        /*for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                newLayout[i][j] = state.board[i][j];
            }
        }*/
        Set<Figure> newMoved = new HashSet<>(state.moved);
        //calculateLayout(newLayout, newMoved, move);
        Color playerTurn = nextPlayer(state.playerTurn);
        return new GameState(playerTurn, newLayout, newMoved, move);
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
