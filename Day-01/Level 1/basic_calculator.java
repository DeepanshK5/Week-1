import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
		//Addition
        float add = num1+num2;
		//Subtraction
        float sub = num1-num2;
		//Multiply
        float mul = num1*num2;
		//Divide
        float div = num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+" ,"+sub+" ,"+mul+" and "+div);
    }
}
