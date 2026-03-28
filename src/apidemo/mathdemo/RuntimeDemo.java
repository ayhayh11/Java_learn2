package apidemo.mathdemo;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
      /*  public staticRuntime getRuntime          当前系统的运行环境对象
        public void exit(int status)             停止虚拟机
        public int availableProcessors()          获得CPU的线程数
        public long maxMemory()                  JVM能从系统中获取总内存大小(单位byte)
        public long totalMemory()               JVM已经从系统中获取总内存大小(单位byte)
        public long freeMemory()                JVM剩余内存大小(单位byte)
        public Process exec(String command)      运行cmd命令*/
        //1.获取Runtime对象
        Runtime r1 = Runtime.getRuntime();
        // System.out.println("CPU的线程数："+r1.availableProcessors());*/
        //Runtime.getRuntime().exit(0);
        System.out.println(r1.maxMemory() / 1024 / 1024 / 1024);
        System.out.println(r1.totalMemory() / 1024 / 1024);
        System.out.println(r1.freeMemory() / 1024 / 1024);
        r1.exec("notepad");


    }
}
