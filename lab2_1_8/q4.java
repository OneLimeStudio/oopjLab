
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println("Quotient is : " + dividend/divisor);
        System.out.println("Remainder is : " + dividend%divisor);
    }
}
