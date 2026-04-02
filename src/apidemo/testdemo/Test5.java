package apidemo.testdemo;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        //判断一个年份时闰年还是平年
        //jdk7
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 2, 1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        //jdk8
        LocalDate localDate = LocalDate.of(2020, 3, 1);
        LocalDate localDate1 = localDate.minusDays(1);
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate.isLeapYear());

    }
}
