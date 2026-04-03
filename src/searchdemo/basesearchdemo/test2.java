package searchdemo.basesearchdemo;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
        // 数据如下:{131,127,147,81,103,23,7,79}
        //需要考虑数组中元素是否重复
        int[] arr={131,127,147,81,103,23,7,79,7};
        int num=7;
        System.out.println(basesearch(arr, num));
    }
    public static ArrayList<Integer> basesearch(int[] arr, int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
               list.add(i);
            }
        }
        return list;
    }
}
