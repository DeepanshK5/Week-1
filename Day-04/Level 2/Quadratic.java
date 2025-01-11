import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 2) {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculating delta (discriminant)

        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return both roots
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root}; // Return single root
        } else {
            // No real roots (delta < 0)
            return new double[]{}; // Return empty array for no real roots
        }
    }
}
