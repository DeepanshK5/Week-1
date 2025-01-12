import java.util.Random;

public class FootballTeam {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101);
        }

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }

    // Method to find the sum of array elements
    static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate mean height
    static double findMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the tallest height
    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
