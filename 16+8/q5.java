class Demo{
    float area(int base , int height){
        return 0.5f*base*height;  
    }
    int area(int side){
        return  side*side;
    }
    float Area(int radius){
        return (float) Math.PI*radius*radius;
    }
}


public class q5{
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        
        System.out.println("The Area is : " + obj1.area(10,10));
    }
}
