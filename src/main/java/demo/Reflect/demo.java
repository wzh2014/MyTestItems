package demo.Reflect;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月14日
 */
class Demo {
    //other codes...
}

class hello {
    public static void main(String[] args) {
        Class<?> demo1 = null;
        Class<?> demo2 = null;
        Class<?> demo3 = null;
        try {
            //一般尽量采用这种形式
            demo1 = Class.forName("demo.Reflect.Demo");
        } catch (Exception e) {
            e.printStackTrace();
        }

        demo2 = new Demo().getClass();
        demo3 = Demo.class;

        System.out.println("类名称   " + demo1.getName());
        System.out.println("类名称   " + demo2.getName());
        System.out.println("类名称   " + demo3.getName());
    }
}