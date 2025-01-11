import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask for salary and years of service
        System.out.println("Enter the salary of the employee: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the years of service of the employee: ");
        int yearsOfService = sc.nextInt();

        // Check if the employee is eligible for bonus
        if (yearsOfService > 5) {
            // Calculate the bonus (5% of the salary)
            double bonus = salary * 0.05;
            System.out.println("The bonus for the employee is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
