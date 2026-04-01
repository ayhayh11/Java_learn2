package apidemo.jdk8datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2002, 6, 2, 0, 0,0);
        System.out.println(ChronoUnit.YEARS.between(birthday, now));
        System.out.println(ChronoUnit.MONTHS.between(birthday, now));
        System.out.println(ChronoUnit.DAYS.between(birthday, now));
        System.out.println(ChronoUnit.HOURS.between(birthday, now));
        System.out.println(ChronoUnit.MINUTES.between(birthday, now));
        System.out.println(ChronoUnit.SECONDS.between(birthday, now));
        System.out.println(ChronoUnit.MILLIS.between(birthday, now));
        System.out.println(ChronoUnit.MICROS.between(birthday, now));
        System.out.println(ChronoUnit.NANOS.between(birthday, now));
        System.out.println(ChronoUnit.WEEKS.between(birthday, now));
        System.out.println(ChronoUnit.DECADES.between(birthday, now));
        System.out.println(ChronoUnit.CENTURIES.between(birthday, now));
        System.out.println(ChronoUnit.MILLENNIA.between(birthday, now));
        System.out.println(ChronoUnit.ERAS.between(birthday, now));
       // System.out.println(ChronoUnit.FOREVER.between(birthday, now));
    }
}
