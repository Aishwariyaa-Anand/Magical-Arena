import java.util.Scanner;

public class magicalArena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    //constructor
    public magicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    //player turn to fight
    public playerTurn() {
        //first rounds attacker and defender
        if (playerA.getHealth() <= playerB.getHealth()) {
            Player attacker = playerA;
            Player defender = playerB;
        }
        else {
            Player attacker = playerB;
            Player defender = playerA;
        }

        while (playerA.isAlive() && playerB.isAlive()) {
            fight(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        
        String winner = (playerA.isAlive()) ? "Player A" : "Player B"
        System.out.printf("%s wins", winner);
    }

    //fight result
    public fight(Player attacker, Player defender) {
        int attackedval = attacker.attackplayer();

        int defendedval = defender.defendplayer();

        int damageCaused = attackedval - defendedval;

        if (damageCaused > 0) {
            defender.damageRecieve(damageCaused);
        }
    }
}