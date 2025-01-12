import java.util.Scanner;

public class PointOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.println("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.println("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Calculate and display the equation of the line
        double[] lineEquation = getLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    // Method to find the equation of a line given two points
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // Calculate the slope (m)
        double intercept = y1 - slope * x1;  // Calculate the y-intercept (b)
        return new double[]{slope, intercept};
    }
}
