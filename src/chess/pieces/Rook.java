package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    /*
    Construct
     */
    public Rook(Board board, Color color) {
        super(board, color);
    }

    /*
    toString
     */
    @Override
    public String toString() {
        return "♛";
    }

}
