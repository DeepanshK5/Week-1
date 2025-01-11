import java.util.Scanner;

public class Age_and_Heigth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages and heights for 3 friends
        System.out.println("Enter Amar age ");
        int amar_Age = sc.nextInt();
        System.out.println("Enter Amar height ");
        int amar_Height = sc.nextInt();

        System.out.println("Enter Akbar age ");
        int akbar_age = sc.nextInt();
        System.out.println("Enter Akbar height ");
        int akbarHeight = sc.nextInt();

        System.out.println("Enter Anthony age ");
        int anthonyage = sc.nextInt();
        System.out.println("Enter Anthony height ");
        int anthonyHeight = sc.nextInt();

        // Temporary youngest friend based on age
        int youngestage = amar_Age;
        String youngestFriend = "Amar";

        if (akbar_age < youngestage) {
            youngestage = akbar_age;
            youngestFriend = "Akbar";
        }
        if (anthonyage < youngestage) {
            youngestage = anthonyage;
            youngestFriend = "Anthony";
        }

        // Temporary tallest friend based on height
        int tallestHeight = amar_Height;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Output results
        System.out.println(youngestFriend + " is the youngest with age " + youngestage);
        System.out.println(tallestFriend + " is the tallest with height " + tallestHeight + " cm");
    }
}
