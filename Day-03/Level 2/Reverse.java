import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp = number;

        int countDigits = 0;
        while(temp>0){
            temp/=10;
            countDigits++;
        }

        int[] array = new int[countDigits];
        int index=0;

        while(number>0){
            array[index] = number%10;
            index++;
            number/=10;
        }

        for(int i=0;i<countDigits;i++){
            System.out.print(array[i]+" ");
        }
    }
}
