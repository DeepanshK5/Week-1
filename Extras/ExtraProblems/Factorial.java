import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a number to calculate its factorial:");
        int number = getInput(scanner);

        // Calculate the factorial using recursion
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);

        scanner.close();
    }

    // Function to get input from the user
    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1; // Base case: 0! = 1! = 1
        }
        return n * calculateFactorial(n - 1); // Recursive step
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}
