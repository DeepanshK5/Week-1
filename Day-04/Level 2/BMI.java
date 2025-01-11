import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D array to store weight, height and BMI of 10 persons (10 rows, 3 columns)
        double[][] person = new double[10][3];

        // Taking input for weight (in kg) and height (in cm) for each person
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            person[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            person[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(person);

        
        String[] Status = findStatus(person);

        // Display the results
        System.out.println("\nPerson, Weight (kg), Height (cm), BMI, Status");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " " + person[i][0] + " " + person[i][1] + " " + person[i][2] + " " + Status[i]);
        }

        sc.close();
    }

    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInCm = data[i][1]; // Height in cm
            double heightInM = heightInCm / 100; // Convert cm to meters
            double bmi = weight / (heightInM * heightInM); // BMI formula
            data[i][2] = bmi; // Store BMI in the 3rd column
        }
    }

    // Method to determine BMI status for each person
    public static String[] findStatus(double[][] data) {
        String[] statuses = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
