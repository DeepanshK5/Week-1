import java.util.Scanner;

public class Divisible_By_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
