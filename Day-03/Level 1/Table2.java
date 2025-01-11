import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        //Create array to store multiplication from 6 to 9
        int[] table = new int[4];

        Scanner sc = new Scanner(System.in);

        //Take input of number from user
        int number = sc.nextInt();

        for(int i=6;i<=9;i++){
            table[i-6] = number*i;
        }

        for(int i=6;i<=9;i++){
            System.out.println(number + " x " + i +" = "+table[i-6]);
        }
    }
}
