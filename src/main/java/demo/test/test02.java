package demo.test;

import java.util.Scanner;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月31日
 */
public class test02 {
    public static int findString(String str1, String str2) {
        int count = 0;
        char[] chs1 = str1.toCharArray();
        char[] chs2 = str2.toCharArray();
        for(int i = 0, j = 0; i < chs1.length; i++) {
            for(j = 0; j < chs2.length; j++) {
                if(chs1[i + j] != chs2[j]) {
                    break;
                }
            }
            //完全匹配
            if(j == chs2.length) {
                count++;
                i = i + j - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入字符串:");
        String str1 = s.next();
        System.out.println("输入要查找的字符串:");
        String str2 = s.next();

        print("查找到的个数：" + findString(str1, str2));

    }

    public static void print(String str){
        System.out.println(str);
    }
}
