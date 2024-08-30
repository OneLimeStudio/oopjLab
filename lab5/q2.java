
import java.util.Scanner;



class plate{
    plate(int length, int width){
        System.out.println("Area of Plate "+ length*width);
    }
}

class Box1 extends  plate{
    Box1(int length, int width , int height){
        super(length, width);
        System.out.println("Area of Box is " + 2*(length*width + width*height + height*length));
    }
}
class  WoodBox extends  Box1{

    WoodBox(int length,int width,int height,int thick) {
        super(length, width, height);
        System.out.println("WoodBox Created with thickness" + thick);

    }
    
}



public class q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int thickness = sc.nextInt();

        WoodBox obj = new WoodBox(length, width, height, thickness);
        sc.close();
    }
}
