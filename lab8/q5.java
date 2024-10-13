public class q5 {
    public static void main(String[] args) {
        int count = 0 ;
        for(String i : args){
            count ++;
        }
        try {
            if(count < 4 ){
                throw  new CheckArguement("Args < 4");
            }
        } catch (CheckArguement e) {
        
            System.out.println(e);
        }
    }
}
