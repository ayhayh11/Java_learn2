package Collectiondemo.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListTest2 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        //Iterator<String> it=l.iterator();
        //迭代器
       /*while (it.hasNext()){
           String next = it.next();
           System.out.println(next);
       }
       //增强for
        for (String s : l) {
            System.out.println(s);
        }
        //lambda表达式
        l.forEach(s->System.out.println( s));*/
        //普通for
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        //列表迭代
        ListIterator<String> it=l.listIterator();
        while (it.hasNext()){
            String str=it.next() ;
            if("bbb"==str){
                it.add("ddd");
            }
        }
        System.out.println(l);

    }
}
