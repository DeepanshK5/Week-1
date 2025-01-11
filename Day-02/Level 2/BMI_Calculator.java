import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Get input from the user.
        
        // Ask for weight and height.
        System.out.println("Enter your weight (in kg):");
        double weight = sc.nextDouble();  // Read weight.
        System.out.println("Enter your height (in meters):");
        double height = sc.nextDouble();  // Read height.
        
        // Calculate BMI using the formula.
        double bmi = weight / (height * height) * 10000;
        System.out.println("Your BMI is: " + bmi);
        
        // Check the BMI category.
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
