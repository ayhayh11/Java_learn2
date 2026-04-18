package functiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-15", "炎龙侠-22", "刑天铠甲-21", "赵老五-99", "王二麻子-18", "李四-20");
        //利用方法引用，收集到student类型数组中
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array));

    }
}