public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double FahrenheitToCelsius(double fahrenheit) {
        double fahrenheittocelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheittocelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double CelsiusToFahrenheit(double celsius) {
        double celsiustofahrenheit = (celsius * 9 / 5) + 32;
        return celsiustofahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double PoundsToKilograms(double pounds) {
        double poundstokilograms = 0.453592;
        return pounds * poundstokilograms;
    }

    // Method to convert kilograms to pounds
    public static double KilogramsToPounds(double kilograms) {
        double kilogramstopounds = 2.20462;
        return kilograms * kilogramstopounds;
    }

    // Method to convert gallons to liters
    public static double GallonsToLiters(double gallons) {
        double gallonstoliters = 3.78541;
        return gallons * gallonstoliters;
    }

    // Method to convert liters to gallons
    public static double LitersToGallons(double liters) {
        double literstogallons = 0.264172;
        return liters * literstogallons;
    }

    public static void main(String[] args) {
        // Testing the UnitConverter class

        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 18.9;

        System.out.println(fahrenheit + " Fahrenheit is equal to " + FahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is equal to " + CelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is equal to " + PoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + KilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is equal to " + GallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + LitersToGallons(liters) + " gallons.");
    }
}
