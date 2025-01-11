import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input.
        int num = sc.nextInt();  // Read the number from user.

        // Check if the number is positive before proceeding.
        if (num > 0) {
            // Loop from 1 to the entered number.
            for (int i = 1; i <= num; i++) {
                // If divisible by both 3 and 5, print "FizzBuzz".
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // If divisible by 3 only, print "Fizz".
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // If divisible by 5 only, print "Buzz".
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, just print the number.
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
