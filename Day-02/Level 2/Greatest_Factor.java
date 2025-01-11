import java.util.Scanner;

public class Greatest_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();  // Read the number from user.

        int greatestFactor = 1;  // Start with 1 as the smallest factor.

        // Loop from one less than the number down to 1.
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {  // Check if i is a factor of the number.
                greatestFactor = i;  // If so, it's the greatest factor.
                break;  // Stop after finding the greatest factor.
            }
        }

        System.out.println("The greatest factor of " + number + " otherthan itself is: " + greatestFactor);
    }
}