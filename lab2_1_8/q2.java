



class DayNum{
    int day;
    public void calculateDAy(){
        day %= 7;
        switch (day) {
            case 1:
                System.out.println("Thursday");
                break;
            case 2:
                System.out.println("Friday");
                break;
            case 3:
                System.out.println("Saturday");
                break;

            case 4:
                System.out.println("Sunday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Tuesday");
                break;
            case 0:
                System.out.println("Wednesday");
                break;
            default:
                throw new AssertionError();
        }
    }
}

public class q2 {
        public static void main(String[] args) {
            DayNum day = new DayNum();
            day.day = 19;
            day.calculateDAy();
        }
}
