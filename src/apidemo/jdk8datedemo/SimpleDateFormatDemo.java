package apidemo.jdk8datedemo;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        ZonedDateTime zdt = now.atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        String result = dtf.format(zdt);
        System.out.println(result);
    }
}
