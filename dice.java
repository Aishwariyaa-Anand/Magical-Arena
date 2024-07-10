import java.util.Random;

public class Dice {
    private Random rand;
    //constructor
    public Dice() {
        this.rand = new Random();
    }
     
    //roll dice value
    public int rollDice() {
        int roll = rand.nextInt(6) + 1;
        System.out.printf("Dice Rolled: %d\n", roll);
        return roll;
    }
}