package Collectiondemo.setdemo.HashSetdemo;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);
        Student s4=new Student("zhangsan",18);
        HashSet<Student> hs=new HashSet<Student>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs);
    }

}
