package apidemo.jdk8datedemo;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2002, 6, 2);
        Period period = Period.between(birthday, today);//第二个参数减去第一个参数；
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());
    }
}
