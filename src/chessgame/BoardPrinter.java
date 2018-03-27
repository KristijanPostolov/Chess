package chessgame;

import java.util.Map;

public class BoardPrinter {

    void show(GameState state) {
        int height = state.getHeight();
        int width = state.getWigth();

        for(int i = height-1; i >= 0; i--) {
            for(int j = 0; j < width; j++) {
                if(state.layout[i][j] == null) {
                    System.out.print("00 ");
                }else {
                    System.out.print(state.layout[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println(state.layout[1][1].possibleMoves(state, new Position(1,1)));
    }

}
