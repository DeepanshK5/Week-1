import java.util.Scanner;

public class ToogleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String str = sc.nextLine();

        StringBuilder s = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>=65&&c<=90){
                 s.append((char)(c + 32));
            }
            else if(c>=97&&c<=122){
                s.append((char)(c - 32));
            }
            else System.out.println("Index "+i+" is Not An Alphabet");
        }

        System.out.println("Final string is "+s);
    }
}
