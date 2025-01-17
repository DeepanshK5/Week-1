import java.util.Scanner;

public class StringOccurances {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string:");
        String str = sc.nextLine();

        // Input the substring to be counted
        System.out.println("Enter the substring:");
        String sub = sc.nextLine();

        int startingIndex = 0;
        int index = str.indexOf(sub,startingIndex);
        int count = 0;

        while(index!=-1){
            count++;
            startingIndex = index+1;
            index = str.indexOf(sub,startingIndex);
        }

        System.out.println("The substring occurs " + count + " times.");
    }
}
