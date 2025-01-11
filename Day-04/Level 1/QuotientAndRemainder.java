import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Using division operator for quotient
        int remainder = number % divisor; // Using modulus operator for remainder

        // Return an array with quotient and remainder
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two numbers
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Get quotient and remainder using the method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        sc.close(); // Close the scanner
    }
}
