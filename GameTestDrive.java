public class GameTestDrive {

    public static void main(String[] args) {

        Player p1 = new Player("Jim");
        Player p2 = new Player("Buck");

        Player [] players = { p1, p2 };

        Game game = new Game( players );

        if (p1 != game.getCurrentPlayer()) {
            System.out.println("Failed current player check.");
        }

        game.setNextPlayer();

        if (p2 != game.getCurrentPlayer()) {
            System.out.println("Failed current player check 2.");
        }       


    }




}