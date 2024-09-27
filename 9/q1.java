
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a  = sc.next();

        System.out.println("The Upper Case String is : " + a.toUpperCase());

        for(int i = 0; i <  a.length(); i ++){
            if(a.charAt(i) >= 97 && a.charAt(i) <= 122){
                System.out.print((char)(a.charAt(i) - 32));
                
            }else{
                System.out.print(a.charAt(i));
            }
        }
        System.out.println();
    }    
}


