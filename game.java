import java.util.Scanner;

public class game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player A attributes");
        System.out.print("Health: ");
        int healthA = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthA = scanner.nextInt();
        System.out.print("Attack: ");
        int attackA = scanner.nextInt();
        Player playerA = new Player(healthA, strengthA, attackA);

        System.out.println("Enter player B attributes");
        System.out.print("Health: ");
        int healthB = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthB = scanner.nextInt();
        System.out.print("Attack: ");
        int attackB = scanner.nextInt();
        Player playerB = new Player(healthB, strengthB, attackB);

        MagicalArena ma = new magicalArena(playerA, playerB);
        ma.play();
    }
}