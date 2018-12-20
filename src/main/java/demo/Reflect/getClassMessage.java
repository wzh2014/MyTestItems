package demo.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 通过反射机制获取类信息
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class getClassMessage {
    public static void main(String[] args) throws Exception {

        Class clazz = null;
        clazz = Class.forName("demo.Reflect.Apple");
        Constructor<Apple> constructor1 = clazz.getConstructor();
        Constructor<Apple> constructor2 = clazz.getConstructor(String.class);

        Apple apple1 = constructor1.newInstance();
        Apple apple2 = constructor2.newInstance("Apple");

        System.out.println(apple1);
        System.out.println(apple2);


    }
}


