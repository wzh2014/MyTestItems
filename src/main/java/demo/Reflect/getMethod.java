package demo.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class getMethod {
    public static void main(String[] args) throws Exception {

        Class clazz = null;
        Method method = null;

        clazz = Class.forName("demo.Reflect.Fruit2");
        Constructor<Fruit2> fruitConstructor = clazz.getConstructor(String.class);
        //创建有参对象实例
        Fruit2 fruit = fruitConstructor.newInstance("Apple");
        //获取空参数show 方法
        method = clazz.getMethod("show",null);
        //执行无参方法
        method.invoke(fruit,null);
        //获取有参show 方法
        method = clazz.getMethod("show",int.class);
        //执行有参方法
        method.invoke(fruit,20);

    }
}

 class Fruit2{
    private String type;

    public Fruit2(String type){
        this.type = type;
    }
    public void show(){
        System.out.println("Fruit type = " + type);
    }
    public void show(int num){
        System.out.println("Fruit type = " + type + ".....Fruit num = " + num);
    }
}
