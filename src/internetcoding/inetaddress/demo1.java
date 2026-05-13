package internetcoding.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("LAPTOP-CLMD1VBO");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
    }
}
