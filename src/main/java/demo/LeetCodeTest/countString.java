package demo.LeetCodeTest;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月01日
 */
public class countString {
    private static void countString(String str,String s) {
        int count = 0;
        while(str.indexOf(s) != -1){

            str = str.substring(str.indexOf(s)+1,str.length());
            count++;

        }
        System.out.println(s+"出现的次数为"+count+"次");
    }

    public static void main(String[] args) {
        countString("abababac","abab");
    }
}
