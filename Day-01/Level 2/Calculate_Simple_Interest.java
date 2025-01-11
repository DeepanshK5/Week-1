import java.util.Scanner;

public class Calculate_Simple_Interest {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Principle");
      double principle = sc.nextDouble();
      System.out.println("Enter Rate");
      double rate = sc.nextDouble();
      System.out.println("Enter Time");
      double time = sc.nextDouble();
      double si = (principle*rate*time)/100;
      System.out.println("Simple Interest will be "+String.format("%.5f",si));
    }
}