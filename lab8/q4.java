public class q4 {
    public static void main(String[] args) {
        int hours = 77;
        int min = 61;
        int sec = 61;
        try{
            handleException(hours, min, sec);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void handleException(int hours,int min , int sec) throws HrsException,secException,minException  {
        if(hours > 24 || hours < 0){
            throw new HrsException("Hours Exception");
        }
        if(min > 60 || min < 0){
            throw new minException("Min Exception");
        }
        if(sec > 24 || sec < 0){
            throw new secException("Seconds Exception");
        }
    } 
}
