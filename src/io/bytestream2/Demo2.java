package io.bytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        long starttime=System.currentTimeMillis();
        FileInputStream fis =new FileInputStream("D:\\JavaTest\\a.txt");
        int b;
        while((b=fis.read())!=-1){
            System.out.println((char)b);
        }
        fis.close();
        long endtime=System.currentTimeMillis();
        System.out.println("耗时："+(endtime-starttime));
    }
}
