
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Amit");
        System.out.println("Enter Character ");
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int index  = a.indexOf(b);
        System.out.println(index);


    }
}
