package demo.EnumDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月24日
 */
public class EnumDemo {

    public static void main(String[] args) {
        //直接引用
        Day day = Day.MONDAY;

        System.out.println(day);
    }

}

/** 定义枚举类型 */
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}