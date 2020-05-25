package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    /*
    Atributtes
     */
    private Color color;

    /*
    Construct
     */
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    /*
    Getter
     */
    public Color getColor() {
        return color;
    }
    
}
