package Collectiondemo.setdemo.treesetdemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        System.out.println(ts);
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()){
            int next = iterator.next();
            System.out.println(next);
        }
        for (Integer t : ts) {
            System.out.println(t);
        }
        ts.forEach((t) ->System.out.println(t));

    }
}
