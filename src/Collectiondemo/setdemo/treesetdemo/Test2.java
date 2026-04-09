package Collectiondemo.setdemo.treesetdemo;

import Collectiondemo.setdemo.HashSetdemo.Student;

import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);
        TreeSet<Student> ts=new TreeSet<Student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
        //不需要重写hashCode和equals方法
    }
}
