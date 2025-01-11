import java.util.Scanner;

public class Trigo_Func {

    // Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigoFunc(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return the results in an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        
        // Calculate the trigonometric functions
        double[] result = calculateTrigoFunc(angle);

        // Display the results
        System.out.printf("Sine: %.4f\n", result[0]);
        System.out.printf("Cosine: %.4f\n", result[1]);
        System.out.printf("Tangent: %.4f\n", result[2]);

        sc.close();  // Close the scanner
    }
}
