import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class numberGame {

    static void guessNumberGame(){
    // Creating a Input Object
        Scanner userInput = new Scanner(System.in);

        // For Generating Random Number
        Random randNum = new Random();
        int randomNumber = randNum.nextInt(100);
        int yourScore;
        int chance = 0;
        int guessNumber;

        // Creating Guess Number Logic
        do {
            System.out.print("Enter the Guess Number 1 to 100 : ");
            guessNumber = userInput.nextInt();
            chance++;

            // Checking Guess Number
            if (guessNumber > randomNumber) {
                System.out.println("Your Number is Wrong, That is a Smaller");
            } else if (guessNumber < randomNumber) {
                System.out.println("Your Number is Wrong, That is a Greater");
            } else if (guessNumber == randomNumber) {
                System.out.println("Congratulation, You Guess the Correct Number");

                // Showing the Score out of 100
                yourScore = 100 - chance;
                System.out.println("Your Score is : " + yourScore);
                
                // For Playing Again this Game.
                System.out.println("Do You Want to Play Again ? Yes or No");
                String playAgain = userInput.nextLine();

                
            }
        } while (guessNumber != randomNumber);
    }
    public static void main(String[] args) {
        guessNumberGame();
        

    }
}