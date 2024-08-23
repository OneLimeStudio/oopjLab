import java.util.Scanner;
class Student{
    static float  largest = 0 ;
    public int Roll;
    public String name;
    public float cgpa;

    public Student(int Roll, String name, float cgpa ) {

        this.Roll = Roll;
        this.name = name;
        this.cgpa = cgpa;
        
    } 
    void Display(){
            System.out.println("The ROll Number is " + Roll);
            System.out.println("The ROll Number is " + name);
            System.out.println("The ROll Number is " + cgpa); 
    }
}
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the iterations ");
        int n  = sc.nextInt();
        Student[] student = new Student[n];
        for(int i =0; i < n; i++){
            System.out.println("What is CGPA ");
            float cgpa = sc.nextFloat();
            System.out.println("What is the Nanme");
            String name = sc.next();
            System.out.println("What is Roll ");
            int Roll = sc.nextInt();
            student[i] = new Student(Roll, name, cgpa);
            student[i].Display();
            
        }
    
    }
}
