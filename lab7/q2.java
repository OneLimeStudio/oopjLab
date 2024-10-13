interface finance{
    public double earnings();
    public double deductions();
    public double bonus();
}

class Manager implements finance{
    int basic;
    public double earnings(){
        return basic; 
    }
    public double deductions(){
        return basic - 0.05*basic;
    }
    public double bonus(){
        return 0.8*basic;
    }
}
class q2{
    public static void main(String[] args) {
        Manager man = new Manager();
        man.basic = 500;
        System.out.println("Earnings " + man.earnings() );
        System.out.println("Deductions " + man.deductions() );
        System.out.println("Bonus  " + man.bonus() );
    
    }
}

