
abstract  class  Message{
    int a = 100 ;
    abstract  void ok();
    static void finale(){
        System.out.println("okojiodhjfkjisd");
       
    }
    void gg(){
        System.out.println("gg");
        System.out.println(a);
    }


}
/**
 * Innerq3
 */
public interface intata {
    int a = 10;
    
}

class X extends  Message{
    public void ok(){
        System.out.println("ok");
    }

    
}
public class q3 {
    private  static int a;
    static{
        //System.out.println("kljsdlkfjsd");
        a = 10;

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // swapn no = new swapn();
        // no.a = a;
        // no.b = b;
        // no.swapNumbers();
        X dslf = new X();
        dslf.ok();
        dslf.gg();
   
        //System.err.println(a);

    }
}
