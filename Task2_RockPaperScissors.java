package Future_intern;
import java.util.Scanner;
import java.util.Random;

public class Task2_RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        boolean keepPlaying = true;

        System.out.println("Welcome to Rock, Paper, Scissors Game!");
        System.out.println("========================================");
        

        while (keepPlaying) {
            System.out.println("Enter your choice (rock, paper, scissors). To stop playing, type 'quit':");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("quit")) {
                keepPlaying = false;
                continue;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                keepPlaying = false;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
