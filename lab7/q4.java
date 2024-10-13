import  java.util.Scanner;
import marketting.*;
public class q4 {
    public static void main(String[] args) {
        sales emp = new sales();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        emp.basic = a;
        
        System.out.println("Earnings " +emp.earnings());
        System.out.println("Travelling Allowance " + emp.allowance());
        
        emp.display();
    }
}
