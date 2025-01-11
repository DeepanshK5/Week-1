import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for three numbers
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
