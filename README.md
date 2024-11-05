# Magical Arena Game

This project simulates a turn-based battle game between two players in a magical arena.

## Features
 ### Command-Line Version:
1. Allows input of attributes for two players (health, strength, attack).
2. Simulates turn-based battles where players attack and defend based on dice rolls.
3. Provides an option to play the game repeatedly until the user chooses to exit.

 ### Graphical User Interface (GUI) Version:

1. Provides a visual interface for entering player attributes.
2. Displays battle results in a text area for better interaction.
3. Same gameplay mechanics as the command-line version.


## Requirements

- Java Development Kit (JDK) installed on your system.
- Text editor or integrated development environment (IDE) to view and edit the code.

## How to Run

### Command-Line Version
1. **Compile the Java files:**
   ```javac Player.java Dice.java MagicalArena.java Game.java```
2. **Run the Game:**
   ```java Game```
3. **Follow the prompts to play the game:**
  - Enter attributes for Player A (health, strength, attack).
  - Enter attributes for Player B (health, strength, attack).
  - The game will simulate battles and ask if you want to play again after each round.
4. **Exit the game:**
  - When prompted, enter 'N' or 'n' to stop playing and exit the game.

### Graphical User Interface (GUI) Version
1. **Compile the GUI Java file:**
   ```javac MagicalArenaGUI.java```
2. **Run the GUI:**
   ```java MagicalArenaGUI```
3. **Enter player attributes and start the battle through the GUI:**
   - Input player attributes in the text fields provided.
   - Click the "Start Battle" button to simulate the battle.
   - View results in the log area.
  

## Example Gameplay
```
Enter player A attributes
Health: 10
Strength: 5
Attack: 5
Enter player B attributes
Health: 10
Strength: 5
Attack: 5
Player A's turn to attack. Roll Dice(Press Enter)
Dice Rolled: 6
Player B's turn to defend. Roll Dice(Press Enter)
Dice Rolled: 5
Player A attacks with 30 damage.
Player B defends with 25 defense.
Player B receives 5 damage.Remaining health: 5

Player B's turn to attack. Roll Dice(Press Enter)
Dice Rolled: 4
Player A's turn to defend. Roll Dice(Press Enter)
Dice Rolled: 2
Player B attacks with 20 damage. 
Player A defends with 10 defense.
Player A receives 10 damage.Player A dies
Player B wins.
----------GAME OVER----------

Do you want to play again?(Y/N):
```
![image](https://github.com/user-attachments/assets/3e036dc9-b1db-4b6e-9dcb-c43887ec3092)
