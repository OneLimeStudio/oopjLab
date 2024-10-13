package General;

public class employee {
    protected int empId = 123;
    private  int ename;
    public double basic;
    public  double  earnings(){
        double bas = basic + (0.95*basic);
       
        return  bas;
    }
    public void display(){
        System.out.println("Id = " + empId);
    }
}
