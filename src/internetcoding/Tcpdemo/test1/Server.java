package internetcoding.Tcpdemo.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket s = ss.accept();
        BufferedReader bf =new BufferedReader(new InputStreamReader(s.getInputStream()));
        int b;
        while ((b= bf.read())!=-1){
            System.out.print((char)b);
        }
        bf.close();
        s.close();
        ss.close();
        System.out.println("服务器已关闭");

    }
}
