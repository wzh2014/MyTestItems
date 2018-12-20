package demo.Reflect.FactoryTest;

import java.io.FileReader;
import java.util.Properties;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class BasicFactory {
    private BasicFactory(){}

    private static BasicFactory bf = new BasicFactory();
    private static Properties pro = null;

    static{
        pro = new Properties();
        try{
            //通过类加载器加载配置文件
            pro.load(new FileReader(BasicFactory.class.getClassLoader().
            getResource("config.properties").getPath()));

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BasicFactory getFactory(){
        return bf;
    }

    /**使用泛型获得通用的对象*/
    public <T> T newInstance(Class<T> clazz){
        //获得字节码对象的类名
        String cName = clazz.getSimpleName();
        //根据字节码对象的类名通过配置文件获得类的全限定名
        String clmplName = pro.getProperty(cName);

        try{
            //根据类的全限定名创建实例对象
            return (T)Class.forName(clmplName).newInstance();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}