import java.util.Scanner;
public class Number_of_handshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		//using formula of sum of all natural numbers
		int handshakes = (numberOfStudents*(numberOfStudents+1))/2;
		System.out.println("Number of possible handshakes "+ handshakes);
	}
}