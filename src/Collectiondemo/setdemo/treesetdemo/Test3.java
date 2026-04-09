package Collectiondemo.setdemo.treesetdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        //添加字母按照长度排序，如果长度一样按照字母排序
        TreeSet<String> ts=new TreeSet<String>((o1,o2)-> {
                int i = o1.length() - o2.length();
                i=i==0?o1.compareTo(o2):i;
                return i;
            }
        );
    }
}
