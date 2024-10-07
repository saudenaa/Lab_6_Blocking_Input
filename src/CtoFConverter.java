import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0 ;
        String trash = " ";
        boolean validInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble(); // Read valid temperature
                in.nextLine(); // Clear the buffer
                validInput = true; // Valid input received, exit loop
            } else {
                // Handle invalid input

                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
                trash = in.nextLine();
            }
        } while (!validInput); // Keep looping until valid input is entered

        // Convert Celsius to Fahrenheit
        fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Output the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);


    }
}
