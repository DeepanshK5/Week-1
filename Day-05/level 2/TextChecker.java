import java.util.Scanner;

public class TextChecker {

    // Method to find the length of a string without using length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text into words without using split() method
    public static String[] splitText(String text) {
        int n = findLength(text), wordCount = 0;
        int[] spaceIndexes = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordCount++] = i;
            }
        }
        spaceIndexes[wordCount++] = n;

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest strings
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int minLength = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLength = minLength;

        for (String[] entry : wordsWithLengths) {
            int length = Integer.parseInt(entry[1]);
            if (length < minLength) {
                minLength = length;
                shortest = entry[0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = entry[0];
            }
        }
        return new String[] { shortest, longest };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        System.out.println("\nWords and their lengths:");
        for (String[] entry : wordsWithLengths) {
            System.out.println("Word: " + entry[0] + ", Length: " + entry[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        sc.close();
    }
}
