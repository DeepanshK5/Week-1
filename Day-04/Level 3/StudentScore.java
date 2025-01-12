import java.util.Scanner;

public class StudentScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number of students
        System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] result = calculateStatistics(scores);

        // Display the scorecard
        displayScorecard(scores, result);
    }

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStatistics(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0; // Rounded average
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded percentage
        }
        return result;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("Student  Physics Chemistry Math Total Average Percentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + " " + scores[i][0] + " " + scores[i][1] + " " + scores[i][2] + " " + (int) result[i][0] + " " + result[i][1] + " " + result[i][2]);
        }
    }
}
