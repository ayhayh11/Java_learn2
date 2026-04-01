package apidemo.datedemo;

import java.util.Date;
import java.util.Random;

public class Test1 {

    public static void main(String[] args) {
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if(time1>time2){
            System.out.println("第一个时间靠后");
        } else if (time2>time1) {
            System.out.println("第二个时间靠后");
        }else{
            System.out.println("两个时间相等");
        }


    }

    public static void example(String[] args) {
        Date d = new Date(0L);
        long time = d.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d.setTime(time);
        System.out.println(d);
    }
}