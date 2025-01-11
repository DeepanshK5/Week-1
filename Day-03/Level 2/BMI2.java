import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_of_person = sc.nextInt();

        double[][] personData = new double[number_of_person][3];

        for(int i=0;i<number_of_person;i++){
            System.out.println("Enter Weight of person "+(i+1));
            personData[i][0] = sc.nextInt();
            System.out.println("Enter height of person "+(i+1));
            personData[i][1] = sc.nextInt();
        }

        for(int i=0;i<number_of_person;i++){
            personData[i][2] = (double)personData[i][0]/((double)personData[i][1]*(double)personData[i][1])*(double)10000;
        }
		
		String[] status = new String[number_of_person];
		
		for(int i=0;i<number_of_person;i++){
			if(personData[i][2]<=18.4)status[i] = "UnderWeight";
			else if(personData[i][2]<25)status[i] = "Normal";
			else if(personData[i][2]<40)status[i] = "OverWeight";
			else status[i] = "Obese";
		}
		
		for(int i=0;i<number_of_person;i++){
			System.out.println(personData[i][2]);
			System.out.println(status[i]);
		}

    }
}
