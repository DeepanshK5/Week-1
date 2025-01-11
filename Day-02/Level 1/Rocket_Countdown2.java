import java.util.Scanner;

public class Rocket_Countdown2 {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Get the starting countdown number from the user
        System.out.println("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Print the current counter value
        }

        // After countdown completes, print the launch message
        System.out.println("Launch!");
    }
}
