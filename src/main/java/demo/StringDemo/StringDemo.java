package demo.StringDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class StringDemo {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Reader,Hello wzh";
        int lastIndex = strOrig.lastIndexOf("Hello");

        if (lastIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Last occurrence of Hello is at index "
            + lastIndex);
        }

        String t1 = "Welcome to wzh.com";
        int index = t1.lastIndexOf("w");
        System.out.println("Found last index is: "+index);
    }
}
