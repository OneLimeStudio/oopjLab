import java.util.Scanner;

abstract class Employee{
   public int EmployeeId;
   public String Name;
    abstract  int calculateSalry();

}
class PartTimeEmployee extends  Employee{
    public PartTimeEmployee(int id, String name) {
        super.EmployeeId = id;
        super.Name = name;
        
    }
    
    public int  calculateSalry(){
        return 500;
    }
}


class ContractEmployee extends  Employee{

    public ContractEmployee(int id, String name) {
        super.EmployeeId = id;
        super.Name = name;
    }
    
    public int  calculateSalry(){
        return 1000;
    }
}
class FullTimeEmployee extends  Employee{
    public FullTimeEmployee(int id, String name) {
        super.EmployeeId = id;
        super.Name = name;
    }
    
    int  calculateSalry(){
        return 2000;
    }
}
public class q4 {
    public static void main(String[] args) {
        System.out.println("1>PartTime 2>FullTime 3>Contract");
   
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("EmpID : ");
        int id = sc.nextInt();
        System.out.println("Name : ");
        String name = sc.next();
        Employee emp;
        switch (a) {
            case 1:
                emp = new PartTimeEmployee(id,name);
                System.out.println(emp.calculateSalry());
                break;
            case 2:
                emp = new FullTimeEmployee(id,name);
                System.out.println(emp.calculateSalry());
                break;
            default:
                emp = new ContractEmployee(id,name);
                System.out.println(emp.calculateSalry());
                break;
        }
        // emp.EmployeeId = id;
        // emp.name = name;

        

    }
}
