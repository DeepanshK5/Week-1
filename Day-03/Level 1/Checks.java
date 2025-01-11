import java.util.Scanner;

public class Checks {
    public static void main(String[] args) {
        // Create an array to store 5 numbers
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  // Get the number from the user
        }

        // Loop through the array and check the conditions
        for (int i = 0; i < 5; i++) {
            int number = numbers[i];
            if (number > 0) {  // If the number is positive
                if (number % 2 == 0) {  // If the number is even
                    System.out.println(number + " is positive and even.");
                } else {  // If the number is odd
                    System.out.println(number + " is positive and odd.");
                }
            } else if (number < 0) {  // If the number is negative
                System.out.println(number + " is negative.");
            } else {  // If the number is zero
                System.out.println(number + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();  // Close the scanner
    }
}
