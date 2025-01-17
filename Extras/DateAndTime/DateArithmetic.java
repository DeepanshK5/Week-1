import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a date in YYYY-MM-DD format:");
        String inputDate = scanner.nextLine();


        LocalDate date = LocalDate.parse(inputDate);


        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + updatedDate);

        LocalDate finalDate = updatedDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);

        scanner.close();
    }
}
