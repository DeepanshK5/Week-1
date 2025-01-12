import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of employees
        int numEmployees = 10;

        // Generate random salaries and years of service
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate bonuses and new salaries
        double[][] bonusData = calculateBonuses(employeeData);

        // Display the results
        displayEmployeeBonuses(employeeData, bonusData);
    }

    // Method to generate random salaries and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // Salary
            data[i][1] = (int) (Math.random() * 10) + 1;         // Years of service
        }
        return data;
    }

    // Method to calculate bonuses and new salaries
    public static double[][] calculateBonuses(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] bonusData = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonusPercentage = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            bonusData[i][0] = Math.round(bonus * 100.0) / 100.0; // Rounded bonus
            bonusData[i][1] = Math.round(newSalary * 100.0) / 100.0; // Rounded new salary
        }
        return bonusData;
    }

    // Method to display employee bonuses
    public static void displayEmployeeBonuses(int[][] employeeData, double[][] bonusData) {
        System.out.println("Employee Salary Years Bonus NewSalary");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.println((i + 1) + " " + employeeData[i][0] + " " + employeeData[i][1] + " " + bonusData[i][0] + " " + bonusData[i][1]);
        }

        // Calculate totals
        int totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][1];
            totalBonus += bonusData[i][0];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }
}
