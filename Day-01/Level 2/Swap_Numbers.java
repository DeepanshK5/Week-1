import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("Before Swapping first = "+first+" and second = "+second);
		int temp = first;
		first = second;
		second = temp;
		System.out.println("After Swapping first = "+first+" and second = "+second);
    }
}
