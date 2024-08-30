
import java.util.Scanner;


 class Box { 
    float length;
    float width;
    float height;
    float getMoneyCube(float  length, float width , float height){
        return  60*length*width*height;
    }
    float getMoneySheet(float length , float width){
        return 40* length *width;
    }
 }

class q1{
    public static void main(String[]  args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Is it a 1>sheet or  2>box");
            int  n = sc.nextInt();

            if(n == 1){
                System.out.println("Enter Length Breadth");
                float len = sc.nextFloat();
                float width = sc.nextFloat();
                Box sheet = new Box();
                System.out.println("The required Money is  :" + sheet.getMoneySheet(len, width));
            }else if(n == 2){
                Box cube = new Box();
                System.out.println("ENter Length Width Height");
                float len = sc.nextFloat();
                float width = sc.nextFloat();
                float height = sc.nextFloat();
                System.out.println("The required Money is  :" + cube.getMoneyCube(len, width, height));
            }
    }
}