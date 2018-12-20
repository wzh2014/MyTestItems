package demo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年10月18日
 */
public class listTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");

        Integer i = 0;

//        String s = "['0','1','2','3']";
//        String[] strings = s.split("'");
//
//        for (String s1 : strings){
//            System.out.println(s1);
//        }

        StringBuffer sb = new StringBuffer();
        sb.append("(");
        for (String s :list){
            sb.append(s).append(",");
        }
        StringBuffer tep = sb.reverse().replace(0,1,")");
        System.out.println(tep.reverse().toString());
//        System.out.println(sb.lastIndexOf(","));
//        System.out.println(sb.charAt(sb.lastIndexOf(",")));
//        System.out.println(sb.toString());

//        for (String s :list){
//            if (list.contains(i)){
//                list.remove(s);
//            }
//        }
    }

}
