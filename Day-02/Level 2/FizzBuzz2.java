import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Get input from the user.
        int num = sc.nextInt();  // Read the number.
        int i = 1;  // Start from 1.

        // Only run if the number is positive.
        if (num > 0) {
            while (i <= num) {
                // Check for FizzBuzz, Fizz, or Buzz.
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);  // Print the number.
                }
                i++;  // Move to the next number.
            }
        }
    }
}
