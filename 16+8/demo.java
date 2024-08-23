
import java.util.Scanner;



class  Box{
    int length,width,height;
    public Box(int length,int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    
    }
    int Volume(){
        return  this.length*this.width*this.height;
    }
    
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length Width Height ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Box objBox = new Box(a, b, c);
        System.out.println("The Volume is " + objBox.Volume());
    }
}
