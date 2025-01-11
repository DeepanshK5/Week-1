import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        // Find the smallest number
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        // Find the largest number
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        // Return an array containing smallest and largest numbers
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 numbers
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();

        // Get the smallest and largest numbers using the method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close(); // Close the scanner
    }
}
