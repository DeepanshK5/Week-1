import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input.
        int number = sc.nextInt();  // Get the number from user.
        
        int number_of_digits = 0;  // Variable to count digits.
        
        // Loop to count digits by dividing the number by 10 until it becomes 0.
        while (number != 0) {
            number /= 10;  // Remove the last digit.
            number_of_digits++;  // Increment the count.
        }
        
        // Output the total number of digits.
        System.out.println("Total number of digits is " + number_of_digits);
    }
}
