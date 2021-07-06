import java.util.HashMap;

public class Board {
    private char [] squares = {' ', ' ', ' ',' ', ' ', ' ',' ', ' ', ' '};

    public char [] getSquares() {
        return squares;
    }

    public void setSquares(char [] squares) {
        this.squares = squares;
    }

    public boolean isValidMove(String squareNumpad) {

        try {
            int squareNumPadInt = Integer.parseInt(squareNumpad);
            int square = changeNumpadInSquare(squareNumPadInt);

            if (square >= squares.length) {
                System.out.println("Square not on the board. Try again.");
                return false;
            }
            if (squares[square] != ' ') {
                System.out.println("Square already occupied. Try again.");
                return false;
            }
            return true;

        } catch (NumberFormatException e) {
            System.out.println("Only numbers, please. Try again.");
            return false;
        }


    }

    public static int changeNumpadInSquare(int numpad) {
        HashMap<Integer, Integer> numPadMap = new HashMap<Integer, Integer>();

        numPadMap.put(7,0);
        numPadMap.put(8,1);
        numPadMap.put(9,2);
        numPadMap.put(4,3);
        numPadMap.put(5,4);
        numPadMap.put(6,5);
        numPadMap.put(1,6);
        numPadMap.put(2,7);
        numPadMap.put(3,8);

        if (numPadMap.get(numpad) == null)
            return 9;

        return numPadMap.get(numpad);
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