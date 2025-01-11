import java.util.Scanner;

public class Number_of_Handshakes2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Number of Student
		int numberOfStudents = sc.nextInt();
        
		int result = number_of_handshakes(numberOfStudents);
		
		System.out.println("The total number of handshakes is "+result);
		
	}
	public static int number_of_handshakes(int student){
		
		int handshakes = (student*(student-1))/2;
		
		return  handshakes;
	}
}