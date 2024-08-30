class Apple{
    void show(){
        System.out.println("APPPPLE");
    }
}
class Banana extends Apple{
    void show(){
        super.show();
        System.out.println("BANANAN");
    }
}
class Cherry extends  Apple{
    void show(){
        super.show();
        System.out.println("CHERRRRYY");
    }
}


public class q3 {
    public static void main(String[] args) {
        Apple a = new Banana();
        a.show();
        Apple b = new Cherry();
        b.show();
}
}
