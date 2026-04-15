package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseDemo1 {
    public static void main(String[] args) {
        //定义一个集合，添加1-10，过滤奇数，结果保存起来并求和
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       List<Integer> al=list.stream().filter(s->s%2==0).collect(Collectors.toList());
        for (Integer i : al) {
            sum=sum+i;
        }
        System.out.println(al+""+sum);
    }
}
