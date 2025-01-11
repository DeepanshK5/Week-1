import java.util.Scanner;

public class Number_of_Handshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Taking input for Number of Student
		int numberOfStudents = sc.nextInt();
		
		//Calling Method for result
		int result = number_of_handshakes(numberOfStudents);
		
		System.out.println("The number of handshakes is "+result);
		
	}
	public static int number_of_handshakes(int student){
		
		int handshakes = (student*(student-1))/2;
		
		return  handshakes;
	}
}