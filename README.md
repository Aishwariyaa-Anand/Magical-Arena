# Magical Arena Game

This project simulates a turn-based battle game between two players in a magical arena.

## Features

- Allows input of attributes for two players (health, strength, attack).
- Simulates turn-based battles where players attack and defend based on dice rolls.
- Provides an option to play the game repeatedly until the user chooses to exit.

## Requirements

- Java Development Kit (JDK) installed on your system.
- Text editor or integrated development environment (IDE) to view and edit the code.

## How to Run

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
