package sortdemo.bubbledemo;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr={5,3,2,1,4};
        for (int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    }

}
