package internetcoding.udpdemo.sendmessage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建发送端
        DatagramSocket ds=new DatagramSocket();
        //封装数据
        String str="你好啊大勇！";
        byte[] bytes = str.getBytes();
        InetAddress address=InetAddress.getByName("127.0.0.1");
        int port=10086;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
        //发送数据
        ds.send(dp);
        System.out.println("发送数据完毕！");
        //关闭发送端
        ds.close();

    }
}
