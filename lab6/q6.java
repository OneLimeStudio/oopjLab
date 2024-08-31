abstract  class Payment{
    abstract void processPayment(int card, int amount);
}


class CreditCardPayment extends Payment{
    void processPayment(int cardNumber , int amount){
        System.out.println("With the card :" + cardNumber + ". " + amount + "has been credited away");
    }
}
class DebitCardPayment extends Payment{
    void processPayment(int cardNumber , int amount){
        System.out.println("With the card :" + cardNumber + ". " + amount + "has been credited away");
    }
}
class PayPalPayment extends Payment{
    void processPayment(int Phonenumber , int amount){
        System.out.println("With the Phone :" + Phonenumber + ". " + amount + "has been credited away");
    }
}
public class q6 {
    public static void main(String[] args) {
        Payment emp;
        emp = new CreditCardPayment();
        emp.processPayment(1000,10000);
        emp = new PayPalPayment();
        emp.processPayment(1000,10000);

    }
}
