package Collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    public static void main(String[] args) {
        /*public boolean add(E e) 添加元素
        public boolean addAll(Collection<? extends E> c) 添加集合
        public void clear() 清空集合
        public boolean contains(Object o) 判断集合中是否包含某个元素
        public boolean containsAll(Collection<?> c) 判断集合中是否包含某个集合
        public boolean isEmpty() 判断集合是否为空
        public boolean remove(Object o) 删除元素
        public boolean removeAll(Collection<?> c) 删除集合
        public int size() 获取集合的长度
        * */
        Collection<String> col=new ArrayList<>();
        col.add("aaa");
        col.addAll( col);
        //col.clear();
        boolean result=col.contains("aaa");
        //底层还是通过equals方法判断,如果集合中元素引用自定义对象需要重写requals方法，
        // 判断字符串的时候java帮我们重写好了equals方法
       /* result=col.contains("bbb");
         result=col.isEmpty();*/
         col.remove("aaa");
         int i =col.size() ;
        System.out.println(col+"  "+result+" "+i);
    }
}
