
public class q3 {
    public static  void checkException(int a) throws  NegativeException{
        if(a < 0){
            throw new NegativeException("Less Than Zero");
        }
        return;
    }
    public static void main(String[] args) {
        int a = 10;
        try{
            //checkException(a);
            throw new NegativeException("ok");
            //System.out.println(a);
        }catch(NegativeException e){
            System.out.println(e);
        }
    }
}

