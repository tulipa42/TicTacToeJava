import java.util.Arrays;

public class BoardTestDrive {

    public static void main(String[] args) {

        Board board = new Board();

        char[] squares = board.getSquares();
        if (squares.length != 9) {
            System.out.println("Failed.");
        }

        char[] squares2 = {' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' '};
        board.setSquares(squares2);

        if (!board.hasWon()) {
            System.out.println("Failed win condition.");

        }

        char[] squares3 = {'X', ' ', ' ', ' ', 'X', 'X', ' ', ' ', 'X'};
        board.setSquares(squares3);

        if (!board.hasWon()) {
            System.out.println("Failed win condition.");

        }

        if (Board.changeNumpadInSquare(7) != 0)
            System.out.println("Failed to change numpad into square");

        if (board.isValidMove("7")) {
            System.out.println("Failed to reject move. Square already occupied.");
        }

        if (board.isValidMove("abc")) {
            System.out.println("Failed to reject move. Input not a number.");
        }

        if (board.isValidMove("31")) {
            System.out.println("Failed to reject move. Square not on the board.");
        }

        board.putPiece('X', 1);
        char[] squaresNew = board.getSquares();
        char[] squaresShould = {'X', 'X', ' ', ' ', 'X', 'X', ' ', ' ', 'X'};

        if (!Arrays.equals(squaresNew, squaresShould)) {
            System.out.println("Failed put piece.");
        }       

        
        char[] squares4 = {'X', 'O', 'X', 'O', 'X', 'X', 'O', 'X', 'O'};
        board.setSquares(squares4);

        if (!board.isFull()) {
            System.out.println("Failed full board.");

        }
    }

}