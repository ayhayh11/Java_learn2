package Collectiondemo.setdemo.HashSetdemo;

public class Test1 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",18);
        Student s2=new Student("lisi",19);
        Student s3=new Student("wangwu",20);
        Student s4=new Student("zhangsan",18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }

}
