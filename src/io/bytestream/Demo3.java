package io.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\JavaTest\\a.txt", true);
        //换行
        byte[]  b1= "nihaonihao".getBytes();
        byte[] b2="woshi ayh".getBytes();
        System.out.println(Arrays.toString(b1));
        fos.write(b1);
        //换行fu
        fos.write("\r\n".getBytes());
        fos.write(b2);
        //续写
        fos.close();
    }
}
