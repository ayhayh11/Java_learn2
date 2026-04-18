package functiondemo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        //倒序排列
        //1、使用匿名内部类
      /*  Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //2、使用Lambda表达式
        Arrays.sort(arr,(o1,o2)->o2-o1);*/
        //3.方法引用
        Arrays.sort(arr,Demo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }
    public static int subtraction(int num1,int num2){
        return num2-num1;
    }
}
