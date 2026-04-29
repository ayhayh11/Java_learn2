package io.bufferedstream;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\a.txt"));
        String line;
        ArrayList<String> ts = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            ts.add(line);

        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\b.txt"));
        ts.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2=Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;

            }
        });
        for (String s : ts) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
