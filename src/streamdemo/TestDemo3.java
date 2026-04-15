package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1, "张三", "李四", "王五", "张六", "张七", "张八", "张九", "张三");
        Collections.addAll(list2, "张三",  "张六", "张七", "张八", "张九");
        list1.stream().distinct().forEach(s -> System.out.println(s));
        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));
    }
}
