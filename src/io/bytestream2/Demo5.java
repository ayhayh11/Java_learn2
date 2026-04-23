package io.bytestream2;

import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\\\a.txt");
        char[] chars = new char[10];
        int len;
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars, 0, len));
        }
        fr.close();

    }
}
