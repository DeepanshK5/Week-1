public class UnitConverter2 {

    // Method to convert yards to feet
    public static double YardsToFeet(double yards) {
        double yardstofeet = 3;
        return yards * yardstofeet;
    }

    // Method to convert feet to yards
    public static double FeetToYards(double feet) {
        double feettoyards = 0.333333;
        return feet * feettoyards;
    }

    // Method to convert meters to inches
    public static double MetersToInches(double meters) {
        double meterstoinches = 39.3701;
        return meters * meterstoinches;
    }

    // Method to convert inches to meters
    public static double InchesToMeters(double inches) {
        double inchestometers = 0.0254;
        return inches * inchestometers;
    }

    // Method to convert inches to centimeters
    public static double InchesToCentimeters(double inches) {
        double inchestocm = 2.54;
        return inches * inchestocm;
    }

    public static void main(String[] args) {
        // Testing the UnitConverter class

        double yards = 10;
        double feet = 30;
        double meters = 5;
        double inches = 50;

        System.out.println(yards + " yards is equal to " + YardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is equal to " + FeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is equal to " + MetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is equal to " + InchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is equal to " + InchesToCentimeters(inches) + " centimeters.");
    }
}
