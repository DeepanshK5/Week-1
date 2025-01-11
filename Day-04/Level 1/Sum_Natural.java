import java.util.Scanner;

public class Sum_Natural {

    // Method to calculate the sum of first 'n' natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;  // Initialize the sum variable
        // Loop through numbers from 1 to n and add them to sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;  // Return the calculated sum
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a positive integer n: ");
        int n = sc.nextInt();

        // Check if the input is a positive number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call the method to calculate the sum and display the result
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        sc.close();  // Close the scanner object
    }
}
