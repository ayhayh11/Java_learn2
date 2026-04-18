package functiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        //chuangjian集合，添加学生对象，获取姓名放到数组当中
        //把姓名和年龄拼接成name-age，并放到数组中
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("张三", 15), new Student("王五", 18),
                new Student("赵六", 19), new Student("小王", 20));
        String[] s=list.stream().map(Student::getInfo).toArray(String[]::new);
        /*String[] s = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName() + "-" + student.getAge();
            }
        }).toArray(String[]::new);*/
        System.out.println(Arrays.toString(s));
       /* String[] s=list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(s));*/
    }
}
