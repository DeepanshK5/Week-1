import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Iterate through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    // If the number is divisible by 2, it is even
                    System.out.println(i + " is an even number.");
                } else {
                    // If the number is not divisible by 2, it is odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
