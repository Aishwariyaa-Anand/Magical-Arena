public class DiceTest {

    public static void main(String[] args) {
        testRollDiceWithinRange();
    }

    public static void testRollDiceWithinRange() {
        Dice dice = new Dice();
        int roll = dice.rollDice();
        assert roll>=1 && roll<=6 : "Dice roll out of range: " + roll;
    }
}