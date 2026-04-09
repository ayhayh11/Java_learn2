package Collectiondemo.setdemo.treesetdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",18,90,99,50);
        Student s2=new Student("lisi",19,90,98,50);
        Student s3=new Student("wangwu",20,95,100,30);
        Student s4=new Student("zhaoliu",21,60,99,70);
        Student s5=new Student("sunqi",22,70,80,70);
        TreeSet<Student> ts=new TreeSet<Student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student t : ts) {
            double score=t.getChinese()+t.getMath()+t.getEnglish();
            System.out.println(t+"total"+score);
        }

    }
}
