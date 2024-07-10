import java.util.Scanner;

public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Scanner sc;

    //constructor
    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.sc = new Scanner(System.in);
    }

    //player turn to fight
    public void play() {
        Player attacker;
        Player defender;
        //first rounds attacker and defender
        if (playerA.getHealth() <= playerB.getHealth()) {
            attacker = playerA;
            defender = playerB;
        }
        else {
            attacker = playerB;
            defender = playerA;
        }

        while (playerA.isAlive() && playerB.isAlive()) {
            fight(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        
        String winner = (playerA.isAlive()) ? "Player A" : "Player B";
        System.out.printf("%s wins.\n", winner);
        System.out.print("----------GAME OVER----------");
    }

    //fight result
    public void fight(Player attacker, Player defender) {
        System.out.printf("%s's turn to attack. Roll Dice(Press Enter)", attacker);
        sc.nextLine();
        int attackedval = attacker.attackplayer();

        System.out.printf("%s's turn to defend. Roll Dice(Press Enter)", defender);
        sc.nextLine();
        int defendedval = defender.defendplayer();

        int damageCaused = attackedval - defendedval;

        if (damageCaused > 0) {
            defender.damageRecieve(damageCaused);
        }

        System.out.printf("%s attacks with %d damage. \n%s defends with %d defense. \n",attacker, attackedval, defender, defendedval);
        System.out.printf("%s receives %d damage.", defender, (damageCaused > 0) ? damageCaused : 0);

        if (defender.getHealth()>0){
            System.out.printf("Remaining health: %d\n\n", defender.getHealth());
        }
        else {
            System.out.printf("%s dies\n\n",defender);
        }
         
    }
}