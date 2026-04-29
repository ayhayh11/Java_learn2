package io.convertstream;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\a.txt"),"utf-8");
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        isr.close();

    }
}
