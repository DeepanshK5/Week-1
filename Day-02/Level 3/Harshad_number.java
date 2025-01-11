import java.util.Scanner;

public class Harshad_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input.
        int number = sc.nextInt();  // Get the number from user.
        
        int temp = number;  // Store the original number.
        int sum_of_digits = 0;  // Variable to store the sum of digits.
        
        // Loop to calculate the sum of digits of the number.
        while (number != 0) {
            sum_of_digits += number % 10;  // Add the last digit to sum.
            number /= 10;  // Remove the last digit.
        }
        
        // Check if the number is divisible by the sum of its digits.
        if (temp % sum_of_digits == 0)
            System.out.println("Harshad Number");  // If true, it's a Harshad number.
        else
            System.out.println("Not Harshad Number");  // Otherwise, it's not.
    }
}
