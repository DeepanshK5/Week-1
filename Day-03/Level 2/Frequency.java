import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

		int temp = number;
		int count = 0;

		while(temp>0){
			temp/=10;
			count++;
		}

		int[] digit_array = new int[count];
		int index = 0;

		while(number>0){
			digit_array[index] = number%10;
			number/=10;
			index++;
		}

		int[] frequency = new int[10];

		for(int i=0;i<count;i++){
			frequency[digit_array[i]]++;
		}

		for(int i=0;i<10;i++){
			System.out.println("Frequency of "+(i+1)+ " is "+frequency[i]);
		}

    }
}
