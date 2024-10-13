public class q2 {
    public static void main(String[] args) {
        int a  = 0;
        try {
            int b = 4/a;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {

            System.out.println("Finally Block Always Executed");

        }
    }
}
