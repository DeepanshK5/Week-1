import java.util.Scanner;

public class Km_to_miles_with_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km*1.6;
        System.out.println("The total miles is "+miles+" mile for the given "+ km+" km");
    }
}