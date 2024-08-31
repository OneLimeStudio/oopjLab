
import java.util.Scanner;


class Employee {
    int basic = 500;
    void  calculateBonus(){
        System.out.println("The Bonus is " + basic);
    }
}
class Manager extends Employee{
    void calculateBonus(){
        System.out.println("The Bonus is " + (super.basic + 0.10*super.basic));
    }
}
class  Intern extends Employee{
    void calculateBonus(){
        System.out.println("The Bonus is " + (super.basic + 0.5*super.basic));
    }
}
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee emp =new Employee();
        System.out.println("1> Employee 2>Manager 3>Intern");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                emp = new Employee();
                break;
            case 2:
                emp = new Manager();
                break;
            case 3:
                emp = new Intern();
                break;
            default:
                break;
        }
        emp.calculateBonus();
    }
}
