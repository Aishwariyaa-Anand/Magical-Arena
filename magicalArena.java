import java.util.Scanner;

public class magicalArena {
    private Player playerA;
    private Player playerB;
    private Dice dice;
    private Scanner sc;

    //constructor
    public magicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
        this.sc = new Scanner();
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
    }

    //fight result
    public fight() {
        System.out.printf("%s's turn to attack. Roll Dice(Press Enter)", attacker);
        sc.nextInt();
        int attackval = dice.rollDice();

        System.out.printf("%s's turn to defend. Roll Dice(Press Enter)", defender);
        sc.nextInt();
        int defendval = dice.rollDice();
    }
}