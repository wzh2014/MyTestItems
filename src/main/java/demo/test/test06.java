package demo.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年10月22日
 */
public class test06 extends test100 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("1000", "a");
        map.put("1001", "b");
        map.put("1002", "3");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
            //entry.getKey() ;entry.getValue(); entry.setValue();
            //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
            System.out.println("key= " + entry.getKey() + " and value= "
                    + entry.getValue());
        }

//        System.out.println(map.containsKey("1000"));

//        List list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        System.out.println(new Long("1000")+"");

    }
}

class test100 {
    public final void say() {

    }
}