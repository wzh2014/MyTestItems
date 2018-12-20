package demo.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class IterateThroughHashMap {
    public static void main(String[] args) {
        HashMap< String, String> hMap = new HashMap<>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        hMap.put("4", "4th");
        Collection cl = hMap.values();
        Iterator itr = cl.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
