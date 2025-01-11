import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Calculate the sum of first 'n' natural numbers using the formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
