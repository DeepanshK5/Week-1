import java.util.Scanner;

public class convert_the_height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
		// Convert into inches
        double height_in_inch = height*2.54;
		//convert into feet
        double height_in_feet = height_in_inch*12;
        System.out.println("Your Height in cm is "+height+" while in feet is "+height_in_feet+" and inches is "+height_in_inch);
    }
}
