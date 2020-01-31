import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test6 {
    public static void main(String args[])throws ParseException {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String s1="2018-03-04";
        Date date=df.parse(s1);
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日");
        String s2=df2.format(date);
        System.out.println(s2);
    }
}
