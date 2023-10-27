# Number Guessing Game

This is a simple Java program for a number guessing game. The program generates a random number between 1 and 100, and the user needs to guess the correct number. The game provides feedback on whether the guess is too high or too low and allows a maximum of 10 attempts to guess the correct number.

## How to Play

1. Clone or download the repository to your local machine.
2. Compile and run the `numberGame.java` file.

```bash
javac numberGame.java
java numberGame

```
1. Follow the on-screen prompts to make your guesses and try to guess the
correct number.

<h2>Game Logic</h2>

<ul>
  <li>The game generates a random number between 1 and 100.</li>
  <li>You have a maximum of 10 attempts to guess the correct number.</li>
  <li>
    After each guess, the program provides feedback, indicating whether the
    guess is too high or too low.
  </li>
  <li>
    If you guess the correct number, you win and your score is calculated based
    on the number of attempts.
  </li>
  <li>
    If you don't guess the correct number within the maximum number of attempts,
    the game will reveal the correct number.
  </li>
</ul>

<h2>Code Overview</h2>
The code is written in Java and consists of a numberGame class. Here is a brief
overview of the main components:

<ul>
  <li>A 'while' loop ensures the game continues until the user decides not to play anymore.</li>
  <li>The random number is generated using the 'Random' class.</li>
  <li>The game logic is implemented in a 'do-while' loop.</li>
  <li>The user's input is taken using a 'Scanner'.</li>
  <li>The user's guess is compared to the random number, and appropriate messages are displayed.</li>
  <li>The game calculates and displays the user's score.</li>
</ul>

<h2>Play Again</h2>

After each game, the user is asked whether they want to play again. If the user enters "yes," the game restarts. If the user enters anything else, the program exits.

Enjoy the game!

<b>Note:</b> You will need Java installed on your machine to run this program.

Feel free to contribute or modify the code to enhance the game further!

