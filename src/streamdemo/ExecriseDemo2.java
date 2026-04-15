package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ExecriseDemo2 {
    public static void main(String[] args) {
        //创建一个arrlist集合，添加姓名年龄字符串，保留年龄大于24的，将结果放到map中，姓名为键，年龄为值
        ArrayList<String> list =new ArrayList<>();
        Collections.addAll(list,"zhangsan-23","lisi-24","wangwu-25");
        Map<String,Integer> map=list.stream()
                .filter(s->Integer.parseInt(s.split("-")[1])>=24)
                .collect(Collectors.toMap(
                        s->s.split("-")[0],
                        s->Integer.parseInt(s.split("-")[1])
                ));
        System.out.println(map);

    }
}
