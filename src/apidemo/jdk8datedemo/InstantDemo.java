package apidemo.jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        //获取当前时间的时间戳对象
        Instant now = Instant.now();
        System.out.println(now);
        //根据秒钟、毫秒，纳秒获取时间戳对象
        Instant instant = Instant.ofEpochMilli(1000L);
        System.out.println(instant);
        Instant instant2 = Instant.ofEpochSecond(1000L);
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(1L, 100000000000L);
        System.out.println(instant3);
        //指定时区
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
        //判断
        boolean before = instant3.isBefore(instant);
        System.out.println(before);
        boolean after = instant3.isAfter(instant);
        System.out.println(after);
        //增加，减少时间系列
        Instant instant4 = Instant.ofEpochMilli(100000L);
        Instant plus = instant4.plusMillis(1000L);
        System.out.println(plus);
        Instant minus = instant4.minusMillis(1000L);
        System.out.println(minus);


    }
}
