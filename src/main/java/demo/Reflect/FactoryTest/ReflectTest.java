package demo.Reflect.FactoryTest;

import demo.Reflect.Fruit;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Fruit fruit = BasicFactory.getFactory().newInstance(Fruit.class);
        System.out.println(fruit);
    }
}
