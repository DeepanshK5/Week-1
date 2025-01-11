import java.util.Scanner;

public class Store_Number {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        int number;
        //Index set to 0
        int index = 0;

        while (true) {//While loop
            number = sc.nextInt();

            //Break conditions
            if(number==0||number<0||index==10)break;

            numbers[index] = number;

            index++;//increment the index
        }

        int sum=0;//total value

        for(int i=0;i<10;i++){
            sum+=numbers[i];
        }

        System.out.println("Sum of Numbers is "+sum);

        sc.close();
    }
}
