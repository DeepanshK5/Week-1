import java.util.Scanner;

public class Mean_Height {
    public static void main(String[] args) {
        //Create double array
        double[] team_height = new double[11];

        Scanner sc = new Scanner(System.in);

        //Run for loop till 11
        for(int i=0;i<11;i++){
            System.out.println("Enter height of player "+(i+1));
            team_height[i] = sc.nextDouble();
        }

        double sum =0;

        //Sum all the heights
        for(int i=0;i<11;i++){
            sum += team_height[i];
        }

        //Find the avarage
        double average = sum/11;

        System.out.println("The average height is "+ average);
    }
}
