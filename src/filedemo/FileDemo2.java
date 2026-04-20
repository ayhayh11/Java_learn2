package filedemo;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        /*public boolean isDirectory() 判断是否为文件夹
        * public boolean isFile() 判断是否为文件
        * public boolean exists() 判断文件是否存在*/
        String str="C:\\Users\\ayh\\Desktop";
        File f=new File(str);
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
    }
}
