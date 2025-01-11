import java.util.Scanner;

public class Leap_Year {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It's a leap year
        } else {
            return false; // It's not a leap year
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is valid (must be >= 1582)
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        } else {
            // Check if the year is a leap year and print the result
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        sc.close();  // Close the scanner
    }
}
