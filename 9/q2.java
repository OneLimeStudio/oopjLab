
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer b  = new StringBuffer(a);
        System.out.println(b.reverse());

        for(int i = a.length() - 1; i >= 0 ; i--){
            System.out.print(a.charAt(i));
        }
    }
}
