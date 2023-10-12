import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        // Creating a Input Object
        Scanner userInput = new Scanner(System.in);

        // For Generating Random Number
        Random randNum = new Random();
        int randomNumber = randNum.nextInt(100);
        int yourScore;
        int chance = 0;
        int guessNumber;
        // Creating Guess Number
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
                yourScore = 100 - chance;
                System.out.println("Your Score is : " + yourScore);
            }
        } while (guessNumber != randomNumber);

    }
}