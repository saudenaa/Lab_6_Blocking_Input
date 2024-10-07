import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1; // Random number from 1 to 10
        int userGuess = 0; // Variable to store the user's guess

        do {
            System.out.print("Guess the number (between 1 and 10): ");
            while (!scanner.hasNextInt()) { // Validate input to ensure it's an integer
                System.out.print("Invalid input. Please enter an integer between 1 and 10: ");
                scanner.next(); // Clear the invalid input
            }
            userGuess = scanner.nextInt(); // Read the user guess

            // Check if the guess is out of bounds
            if (userGuess < 1 || userGuess > 10) {
                System.out.print("Invalid input. Please enter an integer between 1 and 10: ");
            }
        } while (userGuess < 1 || userGuess > 10); // Repeat if the guess is not in the valid range

        // Show the random number and compare with user's guess
        System.out.println("The random number is: " + randomNumber);
        if (userGuess == randomNumber) {
            System.out.println("On the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else {
            System.out.println("Your guess is too high!");
        }

        scanner.close(); // Close the scanner
    }
}
