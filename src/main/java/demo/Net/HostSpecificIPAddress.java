package demo.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class HostSpecificIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入域名：");
        String str = scanner.nextLine();
        InetAddress address = null;
        try {
            address = InetAddress.getByName(str);
        } catch (UnknownHostException e) {
            System.exit(2);
        }
        System.out.println(address.getHostName() + " IP is : " + address.getHostAddress());
        System.exit(0);
    }
}