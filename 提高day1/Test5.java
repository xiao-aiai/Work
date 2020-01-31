import java.text.SimpleDateFormat;
import java.util.Date;

public class Test5 {
    public static void main(String args[]){
        Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
        System.out.println(s.format(date));
    }
}
