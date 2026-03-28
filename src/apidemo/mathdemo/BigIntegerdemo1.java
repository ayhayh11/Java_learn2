package apidemo.mathdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerdemo1 {
    public static void main(String[] args) {
       /* Random r=new Random();
        for (int i = 0;i<=100;i++) {
            BigInteger a=new BigInteger(4,r);
            System.out.println(a);
        }*/
        BigInteger a2=new BigInteger("999");//写小数和字符会报错
        System.out.println(a2);
        //指定静止大整数
        BigInteger a3=new BigInteger("10010",2);
        System.out.println(a3);
    }

}
