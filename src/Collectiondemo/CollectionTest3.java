package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest3 {
    public static void main(String[] args) {
      /*collection的遍历：
      * 迭代器遍历
      * 增强for遍历
      * lambda表达式遍历*/
        //增强for遍历
        Collection<String> coll=new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //快捷生成用对象.for
        for (String s : coll) {
            System.out.println(s);
        }
        }

    }
