package io.bufferedstream;

import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\b.txt"));
        String line= br.readLine();
        int count;
       count=Integer.parseInt(line);
        count++;
        if(count<=3){
            System.out.println("第"+count+"次使用剩余"+(3-count)+"次机会");
        }else{
            System.out.println("次数已用完,请缴费");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\b.txt"));
        bw.write(count+"");
        bw.close();
        br.close();

    }
}
