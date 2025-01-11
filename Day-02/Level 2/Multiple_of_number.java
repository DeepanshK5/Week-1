import java.util.Scanner;

public class Multiple_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for a number.
        System.out.println("Enter a number: ");
        int number = sc.nextInt();  // Read the number.

        // Print a message about multiples below 100.
        System.out.println("The multiples of " + number + " below 100 are:");

        // Loop from 100 down to 1 to find multiples.
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  // Check if i is a multiple of the number.
                System.out.println(i);  // Print the multiple.
            }
        }
    }
}
