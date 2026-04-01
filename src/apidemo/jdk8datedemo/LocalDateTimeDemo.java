package apidemo.jdk8datedemo;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate l=LocalDate.of(2020, 1, 1);
        System.out.println(l);
        int year=now.getYear();
        System.out.println( year);
       int m=now.getMonthValue();
       System.out.println(m);

    }
}
