import java.util.Scanner;

public class Switch_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input.
        
        int number1 = sc.nextInt();  // Get the first number.
        int number2 = sc.nextInt();  // Get the second number.
        String operator = sc.next();  // Get the operator (e.g., +, -, *, /).
        
        int result = -1;  // Initialize result to -1 to indicate an invalid operation initially.

        // Use a switch statement to perform the calculation based on the operator.
        switch (operator) {
            case "+" :
                result = number1 + number2;  // Perform addition.
                break;
            case "-" :
                result = number1 - number2;  // Perform subtraction.
                break;
            case "*" :
                result = number1 * number2;  // Perform multiplication.
                break;
            case "/" :
                result = number1 / number2;  // Perform division.
                break;
            default :
                System.out.println("Invalid Operator");  // Handle invalid operator input.
        }
        
        // If the result is valid, print the result.
        if (result != -1)
            System.out.println("Result of " + operator + " operator in " + number1 + " and " + number2 + " is " + result);
    }
}
