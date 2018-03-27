package chessgame;


public class Game {

    private final BoardPrinter board = new BoardPrinter();

    private final int width;
    private final int height;
    private GameState currentState;

    public Game() {
        this(8, 8);
    }

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void initialize() {
        currentState = ChessLogic.getInitialState();
    }

    public void next() {
        board.show(currentState);
    }


}
