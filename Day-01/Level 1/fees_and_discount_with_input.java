import java.util.Scanner;

public class fees_abd_discount_with_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fees = sc.nextDouble();
        double discountPercent = sc.nextDouble();
        double discount = fees*(discountPercent/100);
        double discountedFees = fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFees );
    }
}