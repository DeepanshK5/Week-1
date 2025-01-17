import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        char feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Provide feedback: 'h' (too high), 'l' (too low), or 'c' (correct).");

        do {
            // Generate a guess using the middle of the current range
            guess = (lowerBound + upperBound) / 2;
            System.out.println("Is your number " + guess + "?");

            // Get feedback from the user
            feedback = scanner.next().charAt(0);

            if (feedback == 'h') {
                upperBound = guess - 1; // Adjust upper bound
            } else if (feedback == 'l') {
                lowerBound = guess + 1; // Adjust lower bound
            } else if (feedback == 'c') {
                System.out.println("Yay! I guessed your number (" + guess + ").");
            } else {
                System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        } while (feedback != 'c'); // Continue until the correct number is guessed

        scanner.close();
    }
}
