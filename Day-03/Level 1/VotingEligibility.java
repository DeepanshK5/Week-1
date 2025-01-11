import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create an array to store the ages
        int[] ages = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();  // Get the age from user
        }

        // Check each age and print if the student can vote or not
        for (int i = 0; i < 10; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();  // Close the scanner
    }
}
