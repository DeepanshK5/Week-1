public class Spring_Season {

    // Method to check if the date is within the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            return true; // Spring season
        } else {
            return false; // Not Spring season
        }
    }

    public static void main(String[] args) {
        // Check if there are exactly two command-line arguments
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        // Parse the month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the input is within the Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
