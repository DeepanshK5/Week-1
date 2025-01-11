import java.util.Scanner;

public class Side_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();
		//perimeter = 4* side
        double side = perimeter/(double)4;
        System.out.println("The length of side is "+side+" Whose perimeter is "+perimeter);
    }
}
