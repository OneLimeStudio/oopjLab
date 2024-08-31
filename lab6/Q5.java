
import java.util.Scanner;

abstract class Shape{
    abstract  void calculateArea();
    abstract  void calculatePerimeter();

} 
class Rectangle extends Shape{
    int l;
    int b;
    public Rectangle(int length, int braedth) {
        l = length;
        b = braedth;
    }
    
    void  calculateArea(){
        System.out.println("The ARea is "  + l*b);
    }
    void calculatePerimeter(){
        System.out.println("The Perimeter is "  + 2*(l+b));
    }
}
class Circle extends Shape{
    int r;
  
    public Circle(int radius) {
        r = radius;
    }
    
    void  calculateArea(){
        System.out.println("The ARea is "  +r*r*3.14);
    }
    void calculatePerimeter(){
        System.out.println("The Perimeter is "  + 2*3.14*r);
    }
}

public class Q5 {
    public static void main(String[] args) {
        System.out.println("1> Rectangle 2> Circle");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Shape sh;
        sh = new Rectangle(10, 10);
        switch (a) {
            case 1:
                int l=  sc.nextInt();
                int b = sc.nextInt();
                sh = new Rectangle(l, b);

                break;
            case 2:
                int r = sc.nextInt();
                sh = new Circle(r);
            default:
                break;
        }
    
        sh.calculateArea();
        sh.calculatePerimeter();
       
        
    }
}
