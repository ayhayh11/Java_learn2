package mapdemo.treemapdemo;

import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm=new TreeMap<>();
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);
        tm.put(s1,"china");
        tm.put(s2,"america");
        tm.put(s3,"japan");
        System.out.println(tm);
    }
}
