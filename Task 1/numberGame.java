import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class numberGame {

    // Creating a Function for the game
    static void userGuessNumberGame() {
        while(true){
            // Creating a Input Object
            Scanner userInput = new Scanner(System.in);
    
            // For Generating Random Number
            Random randNum = new Random();
            int randomNumber = randNum.nextInt(100);
            int yourScore;
            int chance = 0;
            int userGuessNumber;
            int maxAttempt = 10;
    
            do {
                // Creating a Guess Number Logic
                System.out.print("Enter the Guess Number 1 to 100 : ");
                userGuessNumber = userInput.nextInt();
                chance++;
    
                // Checking Guess Number
                if (userGuessNumber == randomNumber) {
                    System.out.println("Congratulation, You Guess the Correct Number :" + randomNumber);
                    // Showing the Score out of 100
                    yourScore = 100 - chance;
                    System.out.println("Your Score is : " + yourScore);
                    break;
                } else if (userGuessNumber > randomNumber) {
                    System.out.println("Your Guess Number is Wrong, That is a Smaller");
                } else if (userGuessNumber < randomNumber) {
                    System.out.println("Your Guess Number is Wrong, That is a Greater");
                }
            } while (chance < maxAttempt);
    
            // Attemps the maximum number
            if (chance == maxAttempt) {
                System.out.println("Sorry, You've reached maximum number of attemps. The Correct number is : " + randomNumber);
                break;
            }
    
            System.out.print("Do You Want Play Again ? Yes or No : ");
            String playAgain = userInput.next();
    
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks For Playing ! ");
                break;
            }
        }

    }
    
    public static void main(String[] args) {
        userGuessNumberGame();

    }
}