
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String a = sc.next();
        System.out.println("Enter 2nd String");
        String b = sc.next();
        System.out.println("The ASCII DIfference between them is" + b.compareTo(a));
    }
}
