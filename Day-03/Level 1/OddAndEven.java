import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take Input
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;  // Exit if input is not valid
        }

        // Calculate array size
        int size = number / 2 + 1;
        
        //arrays for even and odd
        int[] even = new int[size];
        int[] odd = new int[size];
        

        int Index1 = 0;
        int Index2 = 0;
        
        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {  // If the number is even
                even[Index1] = i;
                Index1++;
            } else {  // If the number is odd
                odd[Index2] = i;
                Index2++;
            }
        }

        // Display even numbers
        System.out.println("Even numbers ");
        for (int i = 0; i < Index1; i++) {
            System.out.println(even[i] + " ");
        }
        System.out.println();

        // Display odd numbers
        System.out.println("Odd numbers ");
        for (int i = 0; i < Index2; i++) {
            System.out.println(odd[i] + " ");
        }
        System.out.println();

        sc.close();  // Close the scanner
    }
}
