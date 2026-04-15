package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Testdemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-14", "张三-13", "张三-18", "张三-82", "三-100");
       /* list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
               String s1= arr[1];
                return Integer.parseInt(s1) ;
            }
        }).forEach(s-> System.out.println(s));*/
        list.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}
