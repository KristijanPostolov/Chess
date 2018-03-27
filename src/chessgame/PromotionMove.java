package chessgame;

public class PromotionMove extends Move {

    protected final Figure promotionFigure;

    public PromotionMove(Figure figure, Position from, Position to, Figure promotionFigure) {
        super(figure, from, to);
        this.promotionFigure = promotionFigure;
    }

    @Override
    public void applyOn(Figure[][] board) {
        super.applyOn(board);
        board[to.rank][to.column] = promotionFigure;
    }
}
