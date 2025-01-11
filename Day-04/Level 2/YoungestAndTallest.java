import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for ages
        int[] ages = new int[3];
        System.out.println("Enter the ages of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
        }

        // Taking input for heights
        int[] heights = new int[3];
        System.out.println("Enter the heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            heights[i] = sc.nextInt();
        }

        // Find and display the youngest
        int youngestIndex = findYoungest(ages);
        System.out.println("The youngest friend is: " + getFriendName(youngestIndex));

        // Find and display the tallest
        int tallestIndex = findTallest(heights);
        System.out.println("The tallest friend is: " + getFriendName(tallestIndex));
    }

    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
                index = i;
            }
        }
        return index;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
                index = i;
            }
        }
        return index;
    }

    public static String getFriendName(int index) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        return names[index];
    }
}
