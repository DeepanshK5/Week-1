import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take user input.

        // Get marks for each subject from the user.
        System.out.println("Enter marks of Physics");
        int physics = sc.nextInt();  // Input Physics marks.
        System.out.println("Enter marks of Chemistry");
        int chemistry = sc.nextInt();  // Input Chemistry marks.
        System.out.println("Enter marks of Maths");
        int math = sc.nextInt();  // Input Maths marks.

        // Calculate the average of the three subjects.
        int average = (physics + chemistry + math) / 3;

        // Check the average and assign grade and remarks based on the range.
        if (average >= 80) {
            System.out.println("Grade A with remark " + "Level 4 above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade B with remark " + "Level 3 at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade C with remark " + "Level 2 below, but approaching agency-normalized standards");
        } else if (average >= 50) {
            System.out.println("Grade D with remark " + "Level 1 well below agency-normalized standards");
        } else if (average >= 40) {
            System.out.println("Grade E with remark " + "Level 1- too below agency-normalized standards");
        } else {
            System.out.println("Remedial Standards");  // If average is below 40.
        }
    }
}
