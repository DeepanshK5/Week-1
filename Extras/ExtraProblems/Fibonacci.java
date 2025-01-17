import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of terms
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int terms = scanner.nextInt();

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);

        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Number of terms must be greater than zero.");
            return;
        }

        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int next = a + b; // Calculate the next term
            a = b; // Update a to the next term
            b = next; // Update b to the next term
        }
    }
}
