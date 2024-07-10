import java.util.Scanner;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private char name;

    //constructor
    public Player(int health, int strength, int attack, char name) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
    }

    //attackplayer
    public int attackplayer(int attackval) {
        int damageCreated = attackval * attack;
        return damageCreated;
    }

    //defend
    public int defendplayer(int defendval) {
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
    public String toString() {
        return String.format("Player %s", name);
    }
}