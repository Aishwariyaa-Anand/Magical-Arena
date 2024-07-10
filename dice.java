import java.util.Random;

public class Dice {
    private Random rand;
    //constructor
    public Dice() {
        this.rand = new Random();
    }
     
    //roll dice value
    public int rollDice() {
        return rand.nextInt(6);
    }
}