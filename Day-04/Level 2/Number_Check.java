import java.util.Scanner;

public class Number_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to store 5 numbers
        int[] numbers = new int[5];
        
        // Take input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Check whether each number is positive or negative and even or odd if positive
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + (isEven(numbers[i]) ? "even" : "odd"));
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        
        // Compare the first and last element of the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }

    // Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1; // num1 is greater
        } else if (num1 == num2) {
            return 0; // both are equal
        } else {
            return -1; // num1 is less
        }
    }
}
