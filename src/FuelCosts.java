import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash;
        boolean validInput;

        // Input for gallons of gas in the tank
        do {
            validInput = false; // Reset for each loop
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine(); // Clear the buffer
                if (gallonsInTank > 0) {
                    validInput = true; // Valid input received
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        // Input for fuel efficiency
        do {
            validInput = false; // Reset for each loop
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine(); // Clear the buffer
                if (fuelEfficiency > 0) {
                    validInput = true; // Valid input received
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        // Input for price per gallon of gas
        do {
            validInput = false; // Reset for each loop
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // Clear the buffer
                if (pricePerGallon > 0) {
                    validInput = true; // Valid input received
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        // Calculate the cost to drive 100 miles
        double costFor100Miles = (100 / fuelEfficiency) * pricePerGallon;

        // Calculate how far the car can go with a full tank
        double distanceWithFullTank = gallonsInTank * fuelEfficiency;

        // Output the results
        System.out.println("Cost to drive 100 miles: $" + costFor100Miles);
        System.out.println("Distance car can go with a full tank: " + distanceWithFullTank + " miles");
    }
}
