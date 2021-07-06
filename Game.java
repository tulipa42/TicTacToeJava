public class Game {

    Player [] players;
    Player currentPlayer;

    public Game(Player[] players) {
        this.players = players;
        this.currentPlayer = players[0];
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setNextPlayer() {

        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }
    }

    public static void main(String [] args) {

        GameHelper gh = new GameHelper();

        System.out.println("Get ready to play TicTacToe!");
        System.out.println(" ");
        String p1Name = gh.getUserInput("Player 1, what is your name?");
        String p2Name = gh.getUserInput("Player 2, what is your name?");
        Player p1 = new Player(p1Name);
        Player p2 = new Player(p2Name);
        Player [] players = {p1, p2};

        Game game = new Game(players);

        Board board = new Board();
        board.displayBoard();
        System.out.println("The numpad keys correspond to the squares. So '7' is the top-left square.");

        String move;
        boolean isValidMove;

        while (true) {
            isValidMove = false;

            while (!isValidMove) {
                move = gh.getUserInput(game.currentPlayer.name + ", what is your move? ");
                isValidMove = board.isValidMove(move);
                if (isValidMove)
                    board.putPiece(game.currentPlayer.token, Integer.parseInt(move));
            }            

            board.displayBoard();

            if (board.hasWon()) {
                System.out.println(game.currentPlayer.name + " has won!");
                break;
            }

            if (board.isFull()) {
                System.out.println("It is a tie!");
                break;
            }

            game.setNextPlayer();
        }
    }

}