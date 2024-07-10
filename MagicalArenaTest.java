public class MagicalArenaTest {

    public static void main(String[] args) {
        testPlayMethod();
    }

    public static void testPlayMethod() {
        Player playerA = new Player(100,10,5,'A'); // Example players with health
        Player playerB = new Player(50,5,10,'B');

        MagicalArena ma = new MagicalArena(playerA, playerB);

        ma.play();

        // Verify the winner
        String expectedWinner = (playerA.isAlive()) ? "Player A" : "Player B";
        String actualWinner = (playerA.isAlive()) ? "Player A" : "Player B";

        if (expectedWinner.equals(actualWinner)) {
            System.out.println("Tests passed.");
        } else {
            System.out.println("Tests failed.");
        }
    }
}
