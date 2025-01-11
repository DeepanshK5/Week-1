import java.util.Scanner;

public class find_the_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int totalAmount = unitPrice*quantity;
        System.out.println("The total purchage price is "+totalAmount+" if the quantity "+quantity+" and unitprice is "+unitPrice);
    }
}
