package io.bytestream2;

import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try{
            fr = new FileReader("src\\a.txt");
            int b;
            while((b=fr.read())!=-1){
                System.out.print((char)b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fr.close();
        }
    }
}
