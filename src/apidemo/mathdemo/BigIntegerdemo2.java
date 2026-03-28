package apidemo.mathdemo;

import java.math.BigInteger;

public class BigIntegerdemo2 {
    public static void main(String[] args) {
        /*public BigInteger add(BigInteger val)加法
        public BigInteger subtract(BigInteger val)减法
        public BigInteger multiply(BigInteger val)乘法
        public BigInteger divide(BigInteger val)除法，获取商
        public BigInteger[] divideAndRemainder(BigInteger val)除法，获取商和余数
        publicboolean equals(Object x)比较是否相同
        publicBigInteger pow(int exponent)次幂
        publicBigInteger max/min(BigInteger val)返回较大值/较小值
        publicint intValue(BigInteger val) 转为int类型整数，超出范围数据有误*/
        BigInteger bd1= BigInteger.valueOf(10);
        BigInteger bd2= BigInteger.valueOf(5);
        BigInteger[] bd3=bd1.divideAndRemainder(bd2);
        System.out.println(bd3.length);
        boolean equals = bd1.equals(bd2);
        System.out.println(equals);
        BigInteger bd4=bd1.pow(2);
        System.out.println(bd4);
        BigInteger bd5=bd1.max(bd2);
        System.out.println(bd5);


    }
}
