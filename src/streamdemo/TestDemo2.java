package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class TestDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张三", "李四", "王五", "张六", "孙七", "张八", "吴九", "张十");
        /*list1.stream().filter((String string)-> {
                //返回true时，表示保留该元素，返回false时，表示不保留该元素
                    return string.startsWith("张");
        });*/
        list1.stream().filter(s->s.startsWith("张")).limit(2).skip(1).forEach(System.out::println);
    }
}
