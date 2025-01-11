import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
