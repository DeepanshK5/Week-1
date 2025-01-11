import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input.
        
        System.out.println("Enter a number");
        int number = sc.nextInt();  // Get the number from user.
        
        int temp = 0, original = number;  // Store sum of cubes and the original number.

        // Loop to calculate sum of cubes of digits.
        while (number != 0) {
            temp += Math.pow(number % 10, 3);  // Add cube of the last digit.
            number /= 10;  // Remove the last digit.
        }
        
        // Check if the sum of cubes is equal to the original number.
        if (temp == original)
            System.out.println("Armstrong Number");  // If true, it's Armstrong.
        else 
            System.out.println("NOT Armstrong Number");  // Otherwise, it's not.
    }
}
