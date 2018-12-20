package demo.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class HostSpecificIPAddress2 {
    public static void main(String[] args) {
        InetAddress ipadd;
        String hostname;
        try {
            ipadd = InetAddress.getLocalHost();
            hostname = ipadd.getHostName();
            System.out.println("Your IP address : " + ipadd);
            System.out.println("Your Hostname : " + hostname);
        } catch (UnknownHostException e) {
        }
    }
}