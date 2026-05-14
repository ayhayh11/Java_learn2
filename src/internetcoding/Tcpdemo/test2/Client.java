package internetcoding.Tcpdemo.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.31.28",10000);
        OutputStream os = s.getOutputStream();
        os.write("你最近好吗".getBytes());
        s.shutdownOutput();
        BufferedReader bf =new BufferedReader(new InputStreamReader(s.getInputStream()));
        int b;
        while ((b= bf.read())!=-1){
            System.out.print((char)b);
        }
        os.close();
        s.close();
    }
}
