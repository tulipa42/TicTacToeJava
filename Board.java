public class Board {
    private char [] squares = {' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' '};

    public char [] getSquares() {
        return squares;
    }

    public void setSquares(char [] squares) {
        this.squares = squares;
    }

    public void putPiece(char token, int square) {
        if (squares[square] == ' ') {
            squares[square] = token;
        }
        
    }

    public void displayBoard() {
        System.out.println(" " + squares[0] + " | " + squares[1] + " | " + squares[2]);
        System.out.println("-----------");
        System.out.println(" " + squares[3] + " | " + squares[4] + " | " + squares[5]);
        System.out.println("-----------");
        System.out.println(" " + squares[6] + " | " + squares[7] + " | " + squares[8]);
    }

    public boolean hasWon() {

        if ( squares[0] != ' ' && squares[0] == squares[1] && squares[1] == squares[2] ) return true;
        if ( squares[3] != ' ' && squares[3] == squares[4] && squares[4] == squares[5] ) return true;
        if ( squares[6] != ' ' && squares[6] == squares[7] && squares[7] == squares[8] ) return true;

        if ( squares[0] != ' ' && squares[0] == squares[3] && squares[3] == squares[6] ) return true;
        if ( squares[1] != ' ' && squares[1] == squares[4] && squares[4] == squares[7] ) return true;
        if ( squares[2] != ' ' && squares[2] == squares[5] && squares[5] == squares[8] ) return true;

        if ( squares[0] != ' ' && squares[0] == squares[4] && squares[4] == squares[8] ) return true;
        if ( squares[2] != ' ' && squares[2] == squares[4] && squares[4] == squares[6] ) return true;

        return false;

    }

    public boolean isFull() {
        for (int i = 0; i < squares.length; i++) {
            if (squares[i] == ' ') return false;
        }

        return true;
    }
}