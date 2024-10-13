
import java.util.Scanner;

interface Employee{
    public void  getDetails();

}
interface Manager extends Employee{
    public void getDeptDetails();
}
class Head implements Manager{
   
    String name;
    int id;
    String Deptname;
    int deptId;
    public void getDetails(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("name ");
            name  =  sc.next();
            System.out.println("Id ");
            id= sc.nextInt();
            sc.close();
        } catch (Exception e) {
        }

    }
    public void getDeptDetails(){
        try {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Department name ");
            Deptname  =  sc2.next();
            System.out.println("Dept Id ");
            deptId= sc2.nextInt();
            sc2.close();
        } catch (Exception e) {
        }
        
    }
}

class q3 {
    public static void main(String[] args) {
        Head man = new Head();
        man.getDetails();
        man.getDeptDetails();
        System.out.println();System.out.println();
        System.out.println("Name " + man.name);
        System.out.println("Id "+ man.id);
        System.out.println("Department Name " + man.Deptname);
        System.out.println("Dept Id "+ man.deptId);
    }
}
