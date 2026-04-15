package streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class TestDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三", "张三", "张三");
        System.out.println(list.stream().count());
        /*String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString( arr));*/
        String[] arr2=list.stream().toArray(val -> new String[val]);
        System.out.println(Arrays.toString(arr2));

    }
}
