
import java.util.Scanner;



class swapn{
    int a;
    int b;
    public void swapNumbers(){
        b = a ^ b;
        a = a ^b;
        b = b ^ a;
        System.out.println(a);
        System.out.println(b);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        swapn no = new swapn();
        no.a = a;
        no.b = b;
        no.swapNumbers();

    }
}
