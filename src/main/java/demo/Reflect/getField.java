package demo.Reflect;

import java.lang.reflect.Field;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class getField {
    public static void main(String[] args) throws Exception {
        Class<?> clazz1 = null;
        Field field = null;

        clazz1 = Class.forName("demo.Reflect.Apple");
        //field = clazz.getField("num");       getField() 方法不能获取私有的属性
        // field = clazz.getField("type");     访问私有字段时会报 NoSuchFieldException异常
        //获取私有type 属性
        field = clazz1.getDeclaredField("type");
        //对私有字段的访问取消检查
        field.setAccessible(true);
        //创建无参对象实例
        Apple apple = (Apple) clazz1.newInstance();
        //为无参对象实例属性赋值
        field.set(apple,"Apple");
        //通过fruit 对象获取属性值
        Object type = field.get(apple);

        System.out.println(type);
    }
}
