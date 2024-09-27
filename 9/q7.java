
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = 0 ;
        int  k = a.length()-1;
        while(i!=k){
            if(a.charAt(i)!= a.charAt(k)){
                System.out.println("Not Palindrome");
                break;
            }
            i++;
            k--;
        }
        
        if(i == k){
            System.out.println("Palindrome");
        }

    }
}
