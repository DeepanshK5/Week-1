import java.util.Scanner;

public class Athlete_Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double side1 = sc.nextInt();
		double side2 = sc.nextInt();
		double side3 = sc.nextInt();
		double total = side1+side2+side3;
		double rounds = (double)5.0/total;
		System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
    }
}
