import java.util.Scanner;

public class Double_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double result1 = a+b*c;
        double result2 = a*b+c;
        double result3 = c+a/b;
        double result4 = a%b+c;
        //Now printing all the reuslts
        System.out.println("The result of Int Operation is "+result1 +", "+result2+", "+result3+", "+result4);
    }
}