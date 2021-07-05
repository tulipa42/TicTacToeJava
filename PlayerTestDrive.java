public class PlayerTestDrive {

    public static void main(String[] args) {

        Player p1 = new Player("Jim");
        Player p2 = new Player("Buck");

        if (p1.token != 'X') {
            System.out.println("Token p1 failed.");
        }

        if (p2.token != 'O') {
            System.out.println("Token p2 failed.");
        }

    }
}