package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        /*public boolean createNewFile()  创建文件
        * public boolean mkdir() 创建文件夹
        * public boolean mkdirs() 创建多级文件夹
        * public boolean delete() 删除文件
        **/
       /* File f1=new File("D:\\JavaTest\\b.txt");
        System.out.println(f1.createNewFile());*/
        File f2=new File("D:\\JavaTest\\a");
        System.out.println(f2.mkdir());
        File f3=new File("D:\\JavaTest\\a\\b\\c");
        System.out.println(f3.mkdirs());

    }
}
