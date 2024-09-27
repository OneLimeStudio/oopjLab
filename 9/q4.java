
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Amit ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be Appended ");
        String b = sc.next();
        a.append(b);
        System.out.println(a);


    }
}
