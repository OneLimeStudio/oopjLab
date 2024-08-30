
import java.util.Scanner;

class Account{
    int accountNumber;
    int Balance;
    void input(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account");
            accountNumber = sc.nextInt();
            System.out.println("Enter Balance");
            Balance = sc.nextInt();
            
        } catch (Exception e) {
        }

        

    }
    void display(){
        System.out.println("The Balance is " + Balance);
        System.out.println("The Account Number is "+ accountNumber);
    }
}
class Person extends Account{
    String name;
    int adhr;
    void input(){
        super.input();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name");
            name = sc.next();
            
            System.out.println("Enter Adhaar Number ");
            adhr = sc.nextInt();
            
        } catch (Exception e) {
        }
        

    }
    void display(){
        super.display();
        System.out.println("The Name is " + name);
        System.out.println("The Adhaar Number is "+ adhr);

    }
}


public class q4 {
    public static void main(String[] args) {
        Person per = new Person();
        per.input();
        per.display();
}
}
