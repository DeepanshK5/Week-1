public class RandomNumber {

    public static void main(String[] args) {
        
        int[] randomNumbers = generate4DigitRandomArray(5);

        
        double[] stats = findAverageMinMax(randomNumbers);

        
        System.out.print("Generated 4-digit random numbers: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();

        
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }

    
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (between 1000 and 9999)
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Loop through the array to calculate sum, min, and max
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Return the average, min, and max in an array
        return new double[]{average, min, max};
    }
}
