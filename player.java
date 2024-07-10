import java.util.Scanner;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Dice dice;

    //constructor
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.dice = new Dice();
    }

    //attackplayer
    public int attackplayer() {
        int attackval = dice.rollDice();
        int damageCreated = attackval * attack;
        return damageCreated;
    }

    //defend
    public int defendplayer() {
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

    public int getHealth() {
        return health;
    }
    //tostring
    //public String toString() {
    //    
    //}
}