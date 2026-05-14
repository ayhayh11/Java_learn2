package internetcoding.Tcpdemo.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.31.28",10000);
        OutputStream os = s.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入:");
            String str = sc.nextLine();
            if(str=="886"){
                break;
            }
            os.write(str.getBytes());
        }
        os.close();
        s.close();
    }
}
