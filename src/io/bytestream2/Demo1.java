package io.bytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("D:\\JavaTest\\a.txt");
        int b1 = fis.read();
        System.out.println((char)b1);
        fis.close();
    }
}
