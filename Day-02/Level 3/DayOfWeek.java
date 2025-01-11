import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input.
        int d = sc.nextInt();  // Get the day of the month.
        int m = sc.nextInt();  // Get the month number (1 for January, 2 for February, etc.).
        int y = sc.nextInt();  // Get the year.

        // Calculate the adjusted year (y0) based on the month.
        int y0 = (y - (14 - m)) / 12;
        
        // Calculate correction factors for the year (x), considering leap years.
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        
        // Adjust month for the calculation (m0).
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // Calculate the day of the week (d0) using the formula.
        int d0 = (d + x + (31 * m0) / 12) % 7;
        
        System.out.println("Day is " + d0);  // Output the day of the week (0 = Sunday, 1 = Monday, etc.).
    }
}
