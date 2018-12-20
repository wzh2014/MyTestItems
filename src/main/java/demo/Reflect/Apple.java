package demo.Reflect;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class Apple implements Fruit {
    public int num;
    private String type;

    public Apple(){
        System.out.println("无参构造器Run...........");
    }
    public Apple(String type){
        System.out.println("有参构造器Run..........." + type);
    }
}
