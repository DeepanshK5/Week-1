import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        // Area of triangle in inches
		double area = 0.5*base*height;
		//Area in centimeters
		double area_in_cm = area*2.54;
        System.out.println("Area of Triangle in inches "+area);
        System.out.println("Area of Triangle in cm "+area_in_cm);
    }
}
