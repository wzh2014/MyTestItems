package demo.StringDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class SplitTest {
    public static void main(String args[]) {
        String str = "this-is-my-dog";
        String[] temp;
        String[] temp2;
        String delimeter = "-";
        temp = str.split(delimeter);

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

        System.out.println("--------------- line -----------------");
        str = "max.min.avg.sum";
        delimeter = "\\.";
        temp2 = str.split(delimeter);
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i]);

        }
        System.out.println("--------------- line -----------------");
        String s1 = "y i i b a i . c o m";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
