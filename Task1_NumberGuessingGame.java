package Future_intern;
import java.util.Random;
import java.util.Scanner;

public class Task1_NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("===================================================");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != targetNumber) {
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Too low! Try again:");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again:");
            } else {
            	System.out.println("======================================================");
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            }
        }

        scanner.close();
    }
}
