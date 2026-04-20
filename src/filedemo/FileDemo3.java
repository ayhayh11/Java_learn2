package filedemo;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo3 {
    public static void main(String[] args) {
        /*public long length() 获取文件大小
        public string getAbsolutePath() 获取绝对路径
        public string getPath() 获取路径
        public string getName() 获取文件名
        public long lastModified() 获取最后一次修改时间
        */
        File f1=new File("D:\\JavaTest\\aaa.txt");
        System.out.println(f1.length()/1024);
        File f2=new File("aaa.txt");
        System.out.println(f2.getAbsolutePath());
        long l = f1.lastModified();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(l);
        System.out.println(format);
    }
}
