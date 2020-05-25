package boardgame;

public class Piece {

    /*
    Atributtes
     */
    protected Position position;
    private Board board;

    /*
    Construct
     */
    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    /*
    Getter
    */
    protected Board getBoard() {
        return board;
    }
    
}
