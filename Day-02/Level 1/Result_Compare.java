import java.util.Scanner;

public class Result_Compare {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n > 0) {
            // Calculate sum using while loop
            int sumUsingWhileLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumUsingWhileLoop += counter;
                counter++;
            }

            // Calculate sum using the formula n * (n + 1) / 2
            int sumUsingFormula = n * (n + 1) / 2;

            // Compare both sums and print the result
            System.out.println("while loop: " + sumUsingWhileLoop);
            System.out.println("formula: " + sumUsingFormula);

            // Check if both sums are equal
            if (sumUsingWhileLoop == sumUsingFormula) {
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
