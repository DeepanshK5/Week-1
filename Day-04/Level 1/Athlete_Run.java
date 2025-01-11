import java.util.Scanner;

public class Athlete_Run {

    // Calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Calculate the number of rounds to cover 5 km
    public static double calculateRounds(double perimeter) {
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sides of the triangle using println for prompts
        System.out.println("Enter the first side of the triangle in meters: ");
        double side1 = sc.nextDouble();
        
        System.out.println("Enter the second side of the triangle in meters: ");
        double side2 = sc.nextDouble();
        
        System.out.println("Enter the third side of the triangle in meters: ");
        double side3 = sc.nextDouble();
        
        // Calculate perimeter and rounds
        double perimeter = calculatePerimeter(side1, side2, side3);
        double rounds = calculateRounds(perimeter);
        
        // Output the result
        System.out.printf("The athlete must complete %.2f rounds to complete a 5 km run.\n", rounds);
        
        sc.close();
    }
}
