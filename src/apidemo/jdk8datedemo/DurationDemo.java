package apidemo.jdk8datedemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2002, 6, 2, 0, 0,0);
        Duration duration = Duration.between(birthday, now);
        System.out.println(duration);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
