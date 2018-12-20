package demo.LeetCodeTest;

import java.util.Scanner;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月01日
 */
public class KMP {
    public static int kmp(String str, String dest,int[] next){
        //str文本串  dest 模式串
        for(int i = 0, j = 0; i < str.length(); i++){
            while(j > 0 && str.charAt(i) != dest.charAt(j)){
                j = next[j - 1];
            }
            if(str.charAt(i) == dest.charAt(j)){
                j++;
            }
            if(j == dest.length()){
                return i-j+1;
            }
        }
        return 0;
    }
    public static int[] kmpnext(String dest){
        int[] next = new int[dest.length()];
        next[0] = 0;
        for(int i = 1,j = 0; i < dest.length(); i++){
            while(j > 0 && dest.charAt(j) != dest.charAt(i)){
                j = next[j - 1];
            }
            if(dest.charAt(i) == dest.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入母串:");
        String a = scanner.nextLine();
        System.out.println("请输入子串:");
        String b = scanner.nextLine();
        int[] next = kmpnext(b);
        int res = kmp(a,b,next);
        System.out.println("匹配索引位置为："+res);
        for(int i = 0; i < next.length; i++){
            System.out.print(next[i]+"\t");
        }
        System.out.println();
        System.out.println("next数组长度为："+next.length);
    }
}
