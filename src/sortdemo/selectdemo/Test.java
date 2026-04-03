package sortdemo.selectdemo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //选择排序
        int[] arr={5,3,2,1,4};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
