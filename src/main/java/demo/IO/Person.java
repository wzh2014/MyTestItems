package demo.IO;

import java.io.Serializable;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 被transient修饰的不被序列化
     */
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
