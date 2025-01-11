import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find the sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: the sum of 1 natural number is 1
        } else {
            return n + sumRecursive(n - 1); // Recursive case: sum of n = n + sum of (n-1)
        }
    }

    // Method to find the sum using the formula n * (n + 1) / 2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the value of n
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            sc.close();
            return; // Exit if input is not a valid natural number
        }

        // Calculate sum using recursion
        int recursiveSum = sumRecursive(n);

        // Calculate sum using the formula
        int formulaSum = sumFormula(n);

        // Display the results and compare the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Check if both methods give the same result
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct and same result.");
        } else {
            System.out.println("There is an error in the calculations.");
        }

        sc.close();  // Close the scanner
    }
}
