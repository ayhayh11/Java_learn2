package apidemo.testdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //计算自己活了多少天
        //jdk7
       /* String start = "2000-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(start);
        long time = d.getTime();
        long l = System.currentTimeMillis();
        long l1 = l - time;
        System.out.println(l1/1000/60/60/24);*/
        //jdk8
        LocalDate now = LocalDate.now();
        LocalDate l=LocalDate.of(2000, 1, 1);
        System.out.println(ChronoUnit.DAYS.between(l, now));

    }
}
