package io.bytestream2;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编译
        String str="ni好啊";
        //默认编码是utf-8
        byte[] bytes1=str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2=str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        //解码
        String s1=new String(bytes1);
        System.out.println(s1);
        String s2=new String(bytes2);
        System.out.println(s2);
    }
}
