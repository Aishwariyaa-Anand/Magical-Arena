import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MagicalArenaGUI extends JFrame {
    private JTextArea logArea;
    private JTextField healthAField, strengthAField, attackAField;
    private JTextField healthBField, strengthBField, attackBField;

    public MagicalArenaGUI() {
        setTitle("Magical Arena");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        logArea = new JTextArea();
        logArea.setEditable(false);
        add(new JScrollPane(logArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(4, 3));
        
        inputPanel.add(new JLabel("Player A Health:"));
        healthAField = new JTextField();
        inputPanel.add(healthAField);
        
        inputPanel.add(new JLabel("Player A Strength:"));
        strengthAField = new JTextField();
        inputPanel.add(strengthAField);
        
        inputPanel.add(new JLabel("Player A Attack:"));
        attackAField = new JTextField();
        inputPanel.add(attackAField);

        inputPanel.add(new JLabel("Player B Health:"));
        healthBField = new JTextField();
        inputPanel.add(healthBField);
        
        inputPanel.add(new JLabel("Player B Strength:"));
        strengthBField = new JTextField();
        inputPanel.add(strengthBField);
        
        inputPanel.add(new JLabel("Player B Attack:"));
        attackBField = new JTextField();
        inputPanel.add(attackBField);
        
        JButton startButton = new JButton("Start Battle");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startBattle();
            }
        });
        inputPanel.add(startButton);
        
        add(inputPanel, BorderLayout.SOUTH);
    }

    private void startBattle() {
        // Retrieve player attributes from text fields
        int healthA = Integer.parseInt(healthAField.getText());
        int strengthA = Integer.parseInt(strengthAField.getText());
        int attackA = Integer.parseInt(attackAField.getText());

        int healthB = Integer.parseInt(healthBField.getText());
        int strengthB = Integer.parseInt(strengthBField.getText());
        int attackB = Integer.parseInt(attackBField.getText());

        // Create player instances
        Player playerA = new Player(healthA, strengthA, attackA, 'A');
        Player playerB = new Player(healthB, strengthB, attackB, 'B');
        
        // Create the arena
        MagicalArena arena = new MagicalArena(playerA, playerB);
        
        // Clear log area
        logArea.setText("");

        // Determine attacker and defender based on health
        Player attacker = playerA.getHealth() <= playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        // Run the battle
        while (playerA.isAlive() && playerB.isAlive()) {
            // Attacker's turn
            int attackVal = new Dice().rollDice();
            int attackDamage = attacker.attackplayer(attackVal);
            
            // Defender's turn
            int defendVal = new Dice().rollDice();
            int defendDamage = defender.defendplayer(defendVal);

            // Calculate damage caused
            int damageCaused = attackDamage - defendDamage;
            if (damageCaused > 0) {
                defender.damageRecieve(damageCaused);
            }

            // Log results
            logArea.append(String.format("%s attacks with %d damage.\n", attacker, attackDamage));
            logArea.append(String.format("%s defends with %d defense.\n", defender, defendDamage));
            logArea.append(String.format("%s receives %d damage.\n", defender, Math.max(0, damageCaused)));
            logArea.append(String.format("Remaining health of %s: %d\n\n", defender, defender.getHealth()));

            // Switch roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // Determine winner
        String winner = playerA.isAlive() ? "Player A wins!" : "Player B wins!";
        logArea.append(winner + "\n");
        logArea.append("---------- GAME OVER ----------\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MagicalArenaGUI gui = new MagicalArenaGUI();
            gui.setVisible(true);
        });
    }
}
