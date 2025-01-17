import java.util.Scanner;

public class Palindrome2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = getInput(scanner);

        // Check if the input string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Display the result
        displayResult(input, isPalindrome);

        scanner.close();
    }

    // Function to get input from the user
    public static String getInput(Scanner scanner) {
        return scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Normalize input
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Characters don't match
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }

    // Function to display the result
    public static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}
