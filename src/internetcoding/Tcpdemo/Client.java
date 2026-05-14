package internetcoding.Tcpdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.31.28",10000);
        OutputStream os = s.getOutputStream();
        os.write("你最近好吗".getBytes());
        os.close();
        s.close();
    }
}
