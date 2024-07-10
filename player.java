import java.util.Scanner;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Scanner sc;

    //constructor
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.sc = new Scanner();
    }

    //attackplayer
    public int attackplayer() {
        System.out.printf("%s's turn to attack. Roll Dice(Press Enter)", attacker);
        sc.nextInt();
        int attackval = dice.rollDice();
        int damageCreated = attackval * attack;
        return damageCreated;
    }

    //defend
    public int defendplayer() {
        System.out.printf("%s's turn to defend. Roll Dice(Press Enter)", defender);
        sc.nextInt();
        int defendval = dice.rollDice();
        int damageDefended = strength * defendval;
        return damageDefended;
    }

    public void damageRecieve(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    //tostring
    public String toString() {
        
    }
}