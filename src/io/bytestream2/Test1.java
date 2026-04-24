package io.bytestream2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File source = new File("D:\\JavaTest\\a");
        File target = new File("D:\\JavaTest\\b");
        copydir(source, target);
    }

    private static void copydir(File source, File target) throws IOException {
        target.mkdirs();

        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(target, file.getName()));
                byte[] bytes=new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                copydir(file, new File(target, file.getName()));
            }
        }
    }
}
