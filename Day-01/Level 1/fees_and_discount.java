public class fees_and_discount {
    public static void main(String[] args) {
        double fees = 125000;
        double discountPercent = 10;
		// Get Final discount using fee and discount
        double discount = fees*(discountPercent/100);
		//Remove discount from fees
        double discountedFees = fees-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFees );
    }
}
