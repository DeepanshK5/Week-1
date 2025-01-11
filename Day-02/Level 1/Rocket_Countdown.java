import java.util.Scanner;

public class Rocket_Countdown {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Get the starting countdown number from the user
        System.out.println("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter); // Print the current counter value
            counter--; // Decrement the counter by 1
        }

        // After countdown completes, print the launch message
        System.out.println("Launch!");
    }
}
