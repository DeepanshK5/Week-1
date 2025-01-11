import java.util.Scanner;

public class StudentVoteChecker {

    // Static method to check if the student can vote
    public static boolean canStudentVote(int age) {
        // Check if the age is a negative number
        if (age < 0) {
            return false; // Cannot vote if age is negative
        }
        
        // Check if the age is 18 or greater
        if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible to vote
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store the ages of 10 students
        int[] ages = new int[10];
        
        // Loop to take input for 10 students' ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt(); // Get age input from user
            
            // Call canStudentVote method and display result
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        // Close the scanner object
        sc.close();
    }
}
