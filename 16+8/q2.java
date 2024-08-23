
class Rectangle{
    int length, breadth;

    public Rectangle(int length , int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void Display(){
        System.out.println("The length is " + this.length);
        System.out.println("The Breadth is " + this.breadth);
    }
    int CalculateArea(){
        return this.length*this.breadth;
    }
    int CalculatePerimeneter(){
        return 2*(this.length + this.breadth);
    }
    
}

public class q2 {
    public static void main(String[] args) {
        Rectangle newRect = new Rectangle(10,10);
        newRect.Display();
        System.out.println("Area " + newRect.CalculateArea());
        System.out.println(" Perimenter " + newRect.CalculatePerimeneter());
    }
    
}
