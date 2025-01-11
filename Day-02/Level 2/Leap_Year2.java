import java.util.Scanner;

public class Leap_Year2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input.
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();  // Get the year input from the user.

        // Check if the year is before 1582, as the leap year rule started from that year.
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582");
        }
        // If the year is divisible by 400, it's a leap year.
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        // If the year is divisible by 100 but not 400, it's not a leap year.
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        }
        // If the year is divisible by 4 but not 100, it's a leap year.
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        // If none of the above conditions are true, it's not a leap year.
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
