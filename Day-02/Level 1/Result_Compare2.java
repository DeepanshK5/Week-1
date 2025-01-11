import java.util.Scanner;

public class Result_Compare2 {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n > 0) {
            // Calculate sum using for loop
            int sumUsingForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingForLoop += i;
            }

            // Calculate sum using the formula n * (n + 1) / 2
            int sumUsingFormula = n * (n + 1) / 2;

            // Compare both sums and print the result
            System.out.println("Sum using for loop: " + sumUsingForLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);

            // Check if both sums are equal
            if (sumUsingForLoop == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("The computations are incorrect.");
            }
        } else {
            // Handle case when the input is not a natural number
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
