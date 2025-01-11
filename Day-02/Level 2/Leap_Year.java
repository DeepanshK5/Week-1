import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input.
        
        System.out.println("Enter a year: ");
        int year = sc.nextInt();  // Get the year input from the user.

        // Check if the year is a valid leap year according to the rules.
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");  // If leap year, print this.
        } else if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");  // If the year is less than 1582.
        } else {
            System.out.println(year + " is not a Leap Year.");  // If it's not a leap year, print this.
        }
    }
}