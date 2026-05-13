package internetcoding.udpdemo.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReciveMessageDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端
        DatagramSocket ds = new DatagramSocket(10086);
        System.out.println("接收端已启动，等待接收数据...");
        //创建数据包，用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while (true) {
            ds.receive(dp);
            //解析数据
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            System.out.println("数据是：" + new String(data, 0, length));
            System.out.println("地址是：" + address.getHostAddress());
            System.out.println("端口是：" + port);
        }

    }
}
