package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionTest4 {
    public static void main(String[] args) {
      /*collection的遍历：
      * 迭代器遍历
      * 增强for遍历
      * lambda表达式遍历*/
        // lambda表达式遍历
        Collection<String> coll=new ArrayList<String>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        /*coll.forEach(new Consumer<String>() {
            @Override
            //s依次表达集合中的元素
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        coll.forEach(s-> System.out.println(s));

        }

    }
