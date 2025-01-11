import java.util.Scanner;

public class QuotientAndRemainder2 {

    // Method to find how many chocolates each child gets and the remaining chocolates
    public static int[] divideChocolates(int totalChocolates, int numChildren) {
        int chocolatesPerChild = totalChocolates / numChildren;  // Divide chocolates among children
        int remaining = totalChocolates % numChildren;           // Find remaining chocolates
        return new int[] {chocolatesPerChild, remaining};        // Return both values in an array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the total chocolates and the number of children
        System.out.print("Enter the total chocolates: ");
        int totalChocolates = sc.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numChildren = sc.nextInt();

        // Get the results from the method
        int[] result = divideChocolates(totalChocolates, numChildren);

        // Display the results
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();  // Close the scanner
    }
}
