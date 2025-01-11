import java.util.Scanner;

public class Factorial {
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

            // Use a while loop to calculate the factorial
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
