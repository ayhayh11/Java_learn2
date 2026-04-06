package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args) {
      /*collection的遍历：
      * 迭代器遍历
      * 增强for遍历
      * lambda表达式遍历*/
        //迭代器遍历
        Collection<String> c=new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        Iterator<String> it=c.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

    }
}
