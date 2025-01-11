import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        int[] age = new int[3];
        int[] height = new int[3];

        Scanner sc = new Scanner(System.in);

        int youngest_age = Integer.MAX_VALUE;
        int youngest_index = -1;

        for(int i=0;i<3;i++){
            System.out.println("Enter age :");
            age[i] = sc.nextInt();
            if(age[i]<youngest_age){
                youngest_age = age[i];
                youngest_index = i;
            }
        }

        int tallest_height= Integer.MIN_VALUE;
        int tallest_index = -1;

        for(int i=0;i<3;i++){
            System.out.println("Enter heigth :");
            height[i] = sc.nextInt();
            if(height[i]>tallest_height){
                tallest_height = height[i];
                tallest_index = i;
            }
        }

        System.out.println((youngest_index+1)+" is youngest with age "+youngest_age);
        System.out.println((tallest_index+1)+" is tallest with height "+tallest_height);
    }
}
