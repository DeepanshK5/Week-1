import java.util.Scanner;

public class Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for age
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        // Check if the person can vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
