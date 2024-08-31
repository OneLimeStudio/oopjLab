
import java.util.Scanner;

abstract  class student {
    int rollNumber;
    int regNumber;
    void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Roll Number ");
        
        rollNumber = sc.nextInt();
        System.out.println("Reg Number ");
        regNumber = sc.nextInt();

    }
    abstract  void course();
}
class  kiitian extends student{

    public kiitian() {
        super.getInput();
    }

    void course(){
        System.out.println("Roll Number " + super.rollNumber);
        System.out.println("Reg Number " + super.regNumber);
        System.out.println("Course : BTech in CSSE");
    }

}
public class q3 {
    public static void main(String[] args) {
        kiitian a = new kiitian();
        a.course();
    }
}
