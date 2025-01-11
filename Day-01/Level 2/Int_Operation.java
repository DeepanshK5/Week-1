import java.util.Scanner;

public class Int_Operation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1 = a+b*c;
        int result2 = a*b+c;
        int result3 = c+a/b;
        int result4 = a%b+c;
        //Now printing all the reuslts
        System.out.println("The result of Int Operation is "+result1 +", "+result2+", "+result3+", "+result4);
    }
}