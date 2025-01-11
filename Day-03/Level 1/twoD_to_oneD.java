import java.util.Scanner;

public class twoD_to_oneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] array2 = new int[n][m];

        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("Enter for "+i+" row and "+j+" column");
                array2[i][j] = sc.nextInt();
            }
        }

        int index = 0;

        int[] array1 = new int[n*m];
        
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                array1[index] = array2[i][j];
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(array1[i]+ " ");
        }

    }
}
