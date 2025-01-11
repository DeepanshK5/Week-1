import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner to take user input.
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();  // Read the number from the user.
        boolean isPrime = true;  // Assume the number is prime initially.

        // Check if the number is less than or equal to 1 (not prime).
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number/2 to check for factors.
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {  // If the number is divisible by i, it's not prime.
                    isPrime = false;
                    break;  // Exit loop as we found a factor.
                }
            }
        }

        // Output if the number is prime or not.
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
