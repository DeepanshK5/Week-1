import java.util.Scanner;

public class Division_And_Modulas2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		//Quotient
		int quotient = number1/number2;
		//Remainder
		int remainder = number1%number2;
		//Print the output
		System.out.println("The quotient is "+quotient+" and remainder is "+remainder+ "for "+number1+" and "+number2);
    }
}
