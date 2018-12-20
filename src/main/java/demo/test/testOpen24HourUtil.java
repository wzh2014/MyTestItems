package demo.test;

import java.util.Scanner;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月27日
 */
public class testOpen24HourUtil {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(Open24HourUtil.finalMatch(string));

    }
}
