package demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月07日
 */
public class test {

    private static String groupName;


    private static Map<String,HashMap<Integer,String>> map = new HashMap<>();


    private static HashMap<Integer,String> groupTypeHM = new HashMap<Integer,String>(){{
        put(0,"外部-租车");
        put(1,"外部-优车");
        put(2,"内部-租车");
        put(3,"内部-优车");
    }};

    private static HashMap<Integer,String> regionTypeHM = new HashMap<Integer,String>(){{
        put(0,"境内");
        put(1,"境外");
        put(2,"跨境");
    }};

    private static HashMap<Integer,String> termTypeHM = new HashMap<Integer,String>(){{
        put(0,"短期");
        put(1,"长期");
    }};

    private static HashMap<Integer,String> financeTypeHM = new HashMap<Integer,String>(){{
        put(0,"银行");
        put(1,"售后回租");
        put(2,"信托");
        put(3,"债券");
        put(4,"ABS");
        put(5,"其他");
    }};


    public static void main(String[] args)  {

        map.put("1001",groupTypeHM);
        map.put("1002",regionTypeHM);
        map.put("1003",termTypeHM);
        map.put("1004",financeTypeHM);

//        System.out.println(map);

        groupName = groupTypeHM.get(0) + "-" + regionTypeHM.get(1) + "-" +termTypeHM.get(1) + "-" + financeTypeHM.get(2);

        String str = map.get("1001").get(0)+ "-" + map.get("1002").get(1)+ "-" + map.get("1003").get(1)+ "-" + map.get("1004").get(2);

//        str.intern();
        System.out.println(str.intern());
        System.out.println(str.intern());

//        Hashtable<String,String> hashtable = new Hashtable();
//        hashtable.put("begin", "--------------");
//        hashtable.put("6","6");
//        hashtable.put("6","6");
//        hashtable.put("8","6");
//        hashtable.put("end", "--------------");
//
//        System.out.println(hashtable.toString()+"\t"+hashtable.keySet());

    }

}

