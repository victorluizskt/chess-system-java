/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author victor
 */
public class King extends ChessPiece {

    /*
    Construct
     */
    public King(Board board, Color color) {
        super(board, color);
    }

    /*
    toString
     */
    @Override
    public String toString() {
        return "♚";
    }

}
