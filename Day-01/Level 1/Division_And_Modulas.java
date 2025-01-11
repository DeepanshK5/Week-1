public class Division_And_Modulas {
    public static void main(String[] args) {
        int number_of_pens = 14;
        int number_of_students = 3;
		//Dividing the pens in students
        int equally_divided_pens = number_of_pens/number_of_students;
		//Calculate remaining pens
        int remaining_pens = number_of_pens%number_of_students;
        System.out.println("The Pen Per Student is "+equally_divided_pens+" and the remaining pen not distributed is "+remaining_pens);
    }
}
