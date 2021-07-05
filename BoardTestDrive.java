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

        board.putPiece('X', 1);
        char[] squaresNew = board.getSquares();
        char[] squaresShould = {'X', 'X', ' ', ' ', 'X', 'X', ' ', ' ', 'X'};
        System.out.println(squaresShould);

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