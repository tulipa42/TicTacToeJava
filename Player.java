public class Player {
    String name;
    char token;
    static int numPlayers = 0;
    static char[] tokens = {'X', 'O'};

    public Player() {
        this("John Doe");
    }

    public Player(String name) {
        this.name = name;
        token = tokens[numPlayers];
        numPlayers++;
    }
}