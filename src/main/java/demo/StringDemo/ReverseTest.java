package demo.StringDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class ReverseTest {
    public static void main(String[] args){
        String str = "welcome to wzh";
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("String before reverse: " + str);
        System.out.println("String after reverse: " + reverseStr);
    }
}
