
import java.util.Scanner;

interface  Motor{
    public int capacity= 100;
    void run();
    void consume();

    
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("Washing MAchine is Running");
    }
    public void consume(){
        System.out.println("Consumed");
    }
    void getCapacity(){
        System.out.println(capacity);
    }


}
class  q1{
    public static void main(String[] args) {
        WashingMachine mac= new WashingMachine();
        mac.consume();
        mac.run();
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt();
        
        mac.getCapacity();
    }
}