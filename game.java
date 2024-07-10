import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter player A attributes");
            System.out.print("Health: ");
            int healthA = sc.nextInt();
            System.out.print("Strength: ");
            int strengthA = sc.nextInt();
            System.out.print("Attack: ");
            int attackA = sc.nextInt();
            Player playerA = new Player(healthA, strengthA, attackA, 'A');

            System.out.println("Enter player B attributes");
            System.out.print("Health: ");
            int healthB = sc.nextInt();
            System.out.print("Strength: ");
            int strengthB = sc.nextInt();
            System.out.print("Attack: ");
            int attackB = sc.nextInt(); 
            Player playerB = new Player(healthB, strengthB, attackB, 'B');

            MagicalArena ma = new MagicalArena(playerA, playerB);
            ma.play();

            System.out.print("\n\nDo you want to play again?(Y/N):");
            char ans = sc.next().charAt(0);
            if (ans == 'N' || ans == 'n') {
                break;
            }
        }
        sc.close();
    }
}