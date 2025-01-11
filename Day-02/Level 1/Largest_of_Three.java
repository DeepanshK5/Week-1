import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for three numbers
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the largest
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Is the first number the largest? Yes");
        } else {
            System.out.println("Is the first number the largest? No");
        }

        // Check if the second number is the largest
        if (number2 >= number1 && number2 >= number3) {
            System.out.println("Is the second number the largest? Yes");
        } else {
            System.out.println("Is the second number the largest? No");
        }

        // Check if the third number is the largest
        if (number3 >= number1 && number3 >= number2) {
            System.out.println("Is the third number the largest? Yes");
        } else {
            System.out.println("Is the third number the largest? No");
        }
    }
}
