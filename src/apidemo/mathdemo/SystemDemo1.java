package apidemo.mathdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class SystemDemo1 {
    public static void main(String[] args) {
  /*      public static void exit(int status)                 终止当前运行的 Java虚拟机
        public static long currentTimeMillis()              返回当前系统的时间毫秒值形式
        public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)   数组拷贝*/
        //System.exit(0);//程序正常停止
        //System.out.println("111?");
       // System.exit(1);//非0代表异常停止

       /* System.out.println(System.currentTimeMillis());//1774615688878    1774615707073
        System.out.println("l");*/
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2=new int[10];
        System.arraycopy(arr1,6,arr2,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
