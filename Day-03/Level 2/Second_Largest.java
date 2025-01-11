import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int maxIndex = 10;

        int index = 0;

        int[] digits = new int[maxIndex];

        while(number>0){
            int lastDigit = number%10;
            number/=10;

            if(index<10){
                digits[index] = lastDigit;
                index++;
            }
            else break;
        }

        int largest = -1;
        int secondLargest = -1;
        for(int i=0;i<10;i++){
            if(digits[i]>secondLargest){
                if(digits[i]>largest){
                    secondLargest = largest;
                    largest = digits[i];
                }
                else secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit is "+largest);
        System.out.println("Second largest digit is "+secondLargest);
    }
}
