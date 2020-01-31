import java.util.Calendar;

public class Test7 {
    public static void main(String args[]) {
        Calendar c =Calendar.getInstance();
        c.set(2018,2,14);
        int dayweek=c.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("星期"+dayweek);

    }
}