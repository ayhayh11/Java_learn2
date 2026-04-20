package filedemo;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        //listFiles() 列出当前目录下的所有文件
        File file = new File("D:\\JavaTest");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
