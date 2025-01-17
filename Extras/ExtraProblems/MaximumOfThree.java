import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter the first number:");
        int num1 = getInput(scanner);

        System.out.println("Enter the second number:");
        int num2 = getInput(scanner);

        System.out.println("Enter the third number:");
        int num3 = getInput(scanner);

        // Calculate the maximum
        int max = getmax(num1,num2,num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }

    // Function to get input from the user
    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int getmax(int num1, int num2, int num3){
        return Math.max(num1,Math.max(num2,num3));
    }
}
