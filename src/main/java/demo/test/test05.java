package demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月08日
 */
public class test05 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("I am");
        list.add("WZH");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

}
