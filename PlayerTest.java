public class PlayerTest {

    public static void main(String[] args) {
        testAttackPlayer();
        testDefendPlayer();
        testDamageReceive();
        testIsAlive();
        testGetHealth();
    }

    public static void testAttackPlayer() {
        Player player = new Player(100, 10, 5, 'A');
        int attackval = 5;
        int damageCreated = player.attackplayer(attackval);
        assert damageCreated == 25 : "Expected damage created is 25, but got " + damageCreated;
    }

    public static void testDefendPlayer() {
        Player player = new Player(100, 10, 5, 'A');
        int defendval = 3;
        int damageDefended = player.defendplayer(defendval);
        assert damageDefended == 30 : "Expected damage defended is 30, but got " + damageDefended;
    }

    public static void testDamageReceive() {
        Player player = new Player(100, 10, 5, 'A');
        player.damageRecieve(20);
        assert player.getHealth() == 80 : "Expected health after damage is 80, but got " + player.getHealth();
    }

    public static void testIsAlive() {
        Player player = new Player(100, 10, 5, 'A');
        assert player.isAlive() : "Expected player to be alive.";
        player.damageRecieve(100);
        assert !player.isAlive() : "Expected player to be dead.";
    }

    public static void testGetHealth() {
        Player player = new Player(100, 10, 5, 'A');
        assert player.getHealth() == 100 : "Expected health to be 100, but got " + player.getHealth();
    }

}
