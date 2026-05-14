package internetcoding.Tcpdemo.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket s=ss.accept();
        BufferedReader bf=new BufferedReader(
                new InputStreamReader(s.getInputStream()));
        int b;
        while ((b= bf.read())!=-1){
            System.out.print((char)b);
        }
        OutputStream os = s.getOutputStream();
        os.write("还不错，你呢？".getBytes());
        os.close();
        s.close();
    }
}
