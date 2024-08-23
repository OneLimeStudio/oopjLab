
class HULA{

    int subtract(int a , int b){
        return a-b;
    }
    float subtract(float  a, float  b){
        return a-b;
    }
    int subtract(int a, int b  , int c){
        return a-b-c;
    }
    float subtract(float a , float  b , float  c){
        return a-b-c;
    }
}

public class q4 {
    public static void main(String[] args) {
        HULA obj1 = new HULA();
        System.out.println("The Subtraction is : " + obj1.subtract(100, 50));

    }
}
