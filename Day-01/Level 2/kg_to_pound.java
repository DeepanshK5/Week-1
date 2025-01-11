import java.util.Scanner;

public class kg_to_pound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kg = sc.nextInt();
        double kg_to_pound = kg*(double)2.2;
        System.out.println("The weight of the person in pound is "+kg_to_pound+" and in kg is "+kg);
    }
}