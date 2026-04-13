package streamdemo;

import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("张三风");
        list1.add("张劳");
        list1.add("王五");
        list1.add("赵六");
        list1.add("钱老七");
        list1.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
        //张开头放到新的集合中
       /* ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
        for (String s : list2) {
            System.out.println(s);
        }
        //张开头长度为3的再放到新的集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }
        System.out.println(list3);
    }*/
    }
}
