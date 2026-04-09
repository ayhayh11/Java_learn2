package Collectiondemo.setdemo.HashSetdemo;

import java.util.LinkedHashSet;

public class Test3 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);
        Student s4=new Student("zhangsan",18);
        LinkedHashSet<Student> lhs=new LinkedHashSet<Student>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs);
    }
}
