import java.util.Scanner;

public class Number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
