package apidemo.jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIddemo {
    public static void main(String[] args) {
        //获取Java中支持的所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());
        //获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        //获取指定时区的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
        System.out.println(zoneId1);
    }
}
