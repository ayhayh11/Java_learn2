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

        l.remove(1);
        l.set(1,"ccc");
        l.get(2);
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
