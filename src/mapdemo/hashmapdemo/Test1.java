package mapdemo.hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Student, String> m = new HashMap<Student, String>();
        m.put(new Student("zhangsan", 18), "beijing");
        m.put(new Student("lisi", 19), "shanghai");
        m.put(new Student("wangwu", 20), "guangzhou");
        m.put(new Student("wangwu", 20), "liaoning");
        Set<Map.Entry<Student, String>> entries = m.entrySet();
       m.forEach((student,string)->System.out.println(student+ " " + string));
    }
}
