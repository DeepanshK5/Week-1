import java.util.Scanner;

public class Abundant_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input.
        int number = sc.nextInt();  // Get the number from user.
        
        // Adding 1 because 1 is a factor of every number.
        int sum_of_factors = 1;  // Start with 1 as a factor of all numbers.
        
        // Loop to find all factors of the number up to its square root.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum_of_factors += i;  // Add the factor 'i' to the sum.
                
                // If 'i' is not the square root, add the complement factor (number/i).
                if (number / i != i) sum_of_factors += (number / i);
            }
        }
        
        System.out.println(sum_of_factors);  // Print the sum of factors.
        
        // Check if the sum of factors is greater than the number.
        if (sum_of_factors > number)
            System.out.println("Abundant Number");  // It's an abundant number.
        else
            System.out.println("Not Abundant Number");  // It's not an abundant number.
    }
}
