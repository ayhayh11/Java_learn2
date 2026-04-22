package io.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\JavaTest\\a.txt");
        byte[] b={97,98,99,100};
        fos.write(b,1,2);
        fos.close();
    }
}
