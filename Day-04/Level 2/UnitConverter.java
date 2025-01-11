public class UnitConverter {

    // Method to convert kilometers to miles
    public static double KmToMiles(double km) {
        double kmtomiles = 0.621371;
        return km * kmtomiles;
    }

    // Method to convert miles to kilometers
    public static double MilesToKm(double miles) {
        double milestokm = 1.60934;
        return miles * milestokm;
    }

    // Method to convert meters to feet
    public static double MetersToFeet(double meters) {
        double meterstofeet = 3.28084;
        return meters * meterstofeet;
    }

    // Method to convert feet to meters
    public static double FeetToMeters(double feet) {
        double feettometers = 0.3048;
        return feet * feettometers;
    }

    public static void main(String[] args) {
        
        double km = 10;
        double miles = 6.21;
        double meters = 100;
        double feet = 328.084;

        System.out.println(km + " kilometers is equal to " + KmToMiles(km) + " miles.");
        System.out.println(miles + " miles is equal to " + MilesToKm(miles) + " kilometers.");
        System.out.println(meters + " meters is equal to " + MetersToFeet(meters) + " feet.");
        System.out.println(feet + " feet is equal to " + FeetToMeters(feet) + " meters.");
    }
}
