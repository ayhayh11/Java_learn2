package mapdemo.treemapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        tm.put(1,"coke");
        tm.put(2,"soda");
        tm.put(3,"water");
        //按照编号升序排序

        System.out.println(tm);
    }
}
