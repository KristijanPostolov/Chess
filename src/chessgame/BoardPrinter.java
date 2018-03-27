package chessgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class BoardPrinter {

    void show(GameState state) {
        int height = state.board.height;
        int width = state.board.width;

        for(int i = height-1; i >= 0; i--) {
            for(int j = 0; j < width; j++) {
                if(state.board.isFree(new Position(i, j))) {
                    System.out.print("00 ");
                }else {
                    System.out.print(state.board.get(i, j) + " ");
                }
            }
            System.out.println();
        }
        Position p = new Position(1,1);
        List<Position> moves = state.board.get(p).possibleMoves(state, p).stream().map(m -> m.to).collect(Collectors.toList());
        System.out.println(moves);
    }

}
