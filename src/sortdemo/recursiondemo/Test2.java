package sortdemo.recursiondemo;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
        //递归算法求1-100的阶乘

        System.out.println(factorial(5));

    }
    public  static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
