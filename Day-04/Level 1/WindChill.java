import java.util.Scanner;

public class WindChill {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take temperature and wind speed as input
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();
        
        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        // Create an instance of WindChill class
        WindChill wc = new WindChill();
        
        // Calculate the wind chill
        double windChill = wc.calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.printf("The wind chill temperature is: %.2f\n", windChill);

        sc.close();  // Close the scanner
    }
}
