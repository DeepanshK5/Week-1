import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize the result variable
            int factorial = 1;

            // Use a for loop to calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
