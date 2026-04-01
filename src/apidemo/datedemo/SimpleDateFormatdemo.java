package apidemo.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatdemo {
    public static void main(String[] args) throws ParseException {
       String str="2026-04-01 15:32:11";
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date d = sdf.parse(str);
       System.out.println(d.getTime());

    }

    private static void method() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = new Date();
        System.out.println(sdf.format(d));
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf1.format(d));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时:mm分:ss秒 E");
        System.out.println(sdf2.format(d));
    }
}
