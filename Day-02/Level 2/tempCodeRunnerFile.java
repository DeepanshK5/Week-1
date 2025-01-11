import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the base number.
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();  // Read base number.

        // Ask for the power.
        System.out.print("Enter the power: ");
        int power = sc.nextInt();  // Read power.

        int result = 1;  // Start with 1 as the initial result.

        // Loop to multiply the number by itself 'power' times.
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply the result by the base number.
        }

        // Output the final result.
        System.out.println("Result = " + result);
    }
}
