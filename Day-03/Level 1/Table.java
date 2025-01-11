import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        //Create an array to store 10 integers
        int[] table = new int[10];
        Scanner sc = new Scanner(System.in);
        
        //Take input of number from user
        int number = sc.nextInt();

        //run loop from 1 to 10
        for (int i=1 ; i<=10 ; i++) {
            table[i-1] = number*i; 
        }

        //Print the output
        for (int i=1 ; i<=10 ; i++ ) {
            System.out.println(number+" x "+i+" = "+table[i-1]);
        }
		
		sc.close();// close the scanner

    }
}
