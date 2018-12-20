package demo.StringDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class DeletingCharacter {
    public static void main(String args[]) {
        String str = "This is a Java programe.";
        System.out.println(removeCharAt(str, 13));

        System.out.println(str.substring(0,2));
        System.out.println(str.substring(3));
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);


    }
}
