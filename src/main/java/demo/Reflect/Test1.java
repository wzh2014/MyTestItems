package demo.Reflect;

/**
 * 获取字节码的方式
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class Test1 {
    public static void main(String[] args) {

        Fruit fruit = new Apple();

        //方法一
        Class<?> class1 = fruit.getClass();

        //方法二
        Class<?> class2 = Fruit.class;

        Class class3 = null;
        try {

            //方法三，如果这里不指定类所在的包名会报 ClassNotFoundException 异常
            class3 = Class.forName("demo.Reflect.Fruit");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(class1 + "\t" +class2 + "\t" + class3);

    }
}


