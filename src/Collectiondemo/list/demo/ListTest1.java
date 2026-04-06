package Collectiondemo.list.demo;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        l.add(1,"qqq");
        System.out.println(l);
    }
}
