import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_of_person = sc.nextInt();

        int[] weight = new int[number_of_person];
        int[] height = new int[number_of_person];

        for(int i=0;i<number_of_person;i++){
            System.out.println("Enter Weight of person "+(i+1));
            weight[i] = sc.nextInt();
        }

        for(int i=0;i<number_of_person;i++){
            System.out.println("Enter height of person "+(i+1));
            height[i] = sc.nextInt();
        }

        double[] bmi = new double[number_of_person];

        for(int i=0;i<number_of_person;i++){
            bmi[i] = (double)weight[i]/((double)height[i]*(double)height[i])*(double)10000;
        }
		
		String[] status = new String[number_of_person];
		
		for(int i=0;i<number_of_person;i++){
			if(bmi[i]<=18.4)status[i] = "UnderWeight";
			else if(bmi[i]<25)status[i] = "Normal";
			else if(bmi[i]<40)status[i] = "OverWeight";
			else status[i] = "Obese";
		}
		
		for(int i=0;i<number_of_person;i++){
			System.out.println(bmi[i]);
			System.out.println(status[i]);
		}

    }
}
