package demo.StringDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class ReplaceTest {
    public static void main(String[] args) {
        String str = "Welcome to wzh.com";
        System.out.println("Result 1:"+str.replace('W', 'H'));
        System.out.println("Result 2:"+str.replaceFirst("He", "Wo"));
        System.out.println("Result 3:"+str.replaceAll(".com", ".cn"));
    }
}
