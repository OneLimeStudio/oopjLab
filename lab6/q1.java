
import java.util.Scanner;


class Vehicle{
    void startEngine(){
        System.out.println("The Engine has been started by Vehicle Class");
    }
}
class Bike extends  Vehicle{
    void startEngine(){
        System.out.println("The Engine has been started by Bike Class");
    }
}
class Truck extends  Vehicle{
    void startEngine(){
        System.out.println("The Engine has been started by Truck class");
    }
}

public class q1 {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        Scanner sc = new Scanner(System.in);
        System.out.println("1> Bike 2>Truck ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                obj = new Bike();
                break;
            case 2:
                obj = new Truck();
                break;
            default:
                break;
        }
        obj.startEngine();
    }
}
