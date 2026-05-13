package internetcoding.udpdemo.receivemessage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo1 {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            //创建接收端
            System.out.println("正在启动接收端...");
            ds = new DatagramSocket(null);
            ds.setReuseAddress(true);
            java.net.InetSocketAddress addr = new java.net.InetSocketAddress(10086);
            ds.bind(addr);
            System.out.println("接收端已启动，等待接收数据...");
            
            //创建数据包，用于接收数据
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            
            //接收数据（阻塞方法）
            System.out.println("正在等待数据...");
            ds.receive(dp);
            
            //解析数据
            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            
            System.out.println("数据是：" + new String(data, 0, length));
            System.out.println("地址是：" + address.getHostAddress());
            System.out.println("端口是：" + port);
            
        } catch (Exception e) {
            System.err.println("发生错误：" + e.getClass().getName());
            System.err.println("错误信息：" + e.getMessage());
            e.printStackTrace();
        } finally {
            if (ds != null && !ds.isClosed()) {
                ds.close();
                System.out.println("接收端已关闭");
            }
        }
    }
}
