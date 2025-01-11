import java.util.Scanner;

public class SumtillZero {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Initialize total to 0.0 to store the sum
        double total = 0.0;
        double number;

        // Loop to continue adding until the user enters 0
        while (true) {
            // Ask the user to enter a number
            System.out.println("Enter a number (0 to stop): ");
            number = sc.nextDouble();

            // Check if the entered number is 0 to stop the loop
            if (number == 0) {
                break; // Exit the loop if 0 is entered
            }

            // Add the entered number to total
            total += number;
        }

        // Print the total sum after the loop finishes
        System.out.println("The total sum is: " + total);
    }
}
