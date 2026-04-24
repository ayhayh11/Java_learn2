package io.bytestream2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\JavaTest\\a1.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b=fr.read())!=-1){
            sb.append((char)b);
        }
        fr.close();
        //System.out.println(sb);
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
        FileWriter fw = new FileWriter("D:\\JavaTest\\a1.txt");
        String str = Arrays.toString(arr).replace(",","-");
        String result=str.substring(1,str.length()-1);
        fw.write(result);
        fw.close();

    }
}
