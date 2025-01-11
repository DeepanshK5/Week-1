import java.util.Scanner;

public class yards_and_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
		double distance_in_yard = distance*3;
		double distance_in_miles = distance_in_yard*1760;
		System.out.println("your distance in cm "+distance+" in yard "+distance_in_yard+" in miles "+distance_in_miles);
    }
}
