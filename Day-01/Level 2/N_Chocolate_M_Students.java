import java.util.Scanner;

public class N_Chocolate_M_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_chocolate = sc.nextInt();
        int number_of_student = sc.nextInt();
        int divided_chocolate = number_of_chocolate/number_of_student;
        int remaining = number_of_chocolate%number_of_student;
		System.out.println("The number of chocolates each child gets is "+divided_chocolate+" and the number of remaining chocolates are "+remaining);
    }
}
