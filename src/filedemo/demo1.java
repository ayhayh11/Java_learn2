package filedemo;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        String str="C:\\Users\\ayh\\Desktop\\a.txt";
        File f1=new File(str);
        System.out.println(f1);
        String parent="C:\\Users\\ayh\\Desktop";
        String child="a.txt";
        File f2=new File(parent,child);
        System.out.println(f2);
    }
}
