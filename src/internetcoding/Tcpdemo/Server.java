package internetcoding.Tcpdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        //监听客户端连接
        Socket s = ss.accept();
        //获取输入流
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        int b;
        while ((b= br.read())!=-1){
            System.out.print((char)b);
        }
        /*byte[] b=new byte[1024];
        int len=is.read(b);
        System.out.println(new String(b,0,len));*/
        //关闭流
        br.close();
        s.close();
        ss.close();

    }
}
