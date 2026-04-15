package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-男-14","李四-男-18","王五-女-16",
                "张无忌-男-22","杨过-男-18","小龙女-女-19","黄蓉-女-30");
     /*   Map<String, String> collect = list.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                String[] arr = s.split("-");
                return arr[0];
            }
        }, new Function<String, String>() {
            @Override
            public String apply(String s) {
                String[] arr = s.split("-");
                return arr[1] + arr[2];
            }
        }));
        System.out.println(collect);*/
        Map map1=list.stream()
                .filter(s->"男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s->s.split("-")[0],
                        s->s.split("-")[1]+s.split("-")[2]));
        System.out.println(map1);

    }
}
