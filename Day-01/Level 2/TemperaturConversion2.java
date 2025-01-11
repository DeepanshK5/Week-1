import java.util.Scanner;

public class TemperaturConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit-32)*5/9;
		System.out.println("The "+fahrenheit+"fahrenheit in celsius is "+celsius);
    }
}
