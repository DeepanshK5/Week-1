import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter Time: ");
		double time = sc.nextDouble();
		
		double simpleInterest = get_si(principal,rate,time);
		System.out.println("Simple Interest = "+simpleInterest);
		System.out.println("Total Amount with Interest = "+(simpleInterest+principal));
    }
	
	public static double get_si(double principal,double rate,double time){
		double result = (principal*rate*time)/(double)100;
		return result;
	}
}