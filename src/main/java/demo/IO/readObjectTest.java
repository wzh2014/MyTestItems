package demo.IO;

import java.io.*;
import java.io.FileInputStream;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class readObjectTest {
    /**
     * 读取对象
     */
    public static void readObject() throws IOException {
        try {
            InputStream inputStream = new FileInputStream("C:\\Users/zhihong.wan/Desktop/person.tmp");
            //构建缓冲流
            BufferedInputStream buf = new BufferedInputStream(inputStream);
            //构建字符输入的对象流
            ObjectInputStream obj = new ObjectInputStream(buf);
            Person tempPerson = (Person) obj.readObject();
            System.out.println("Person对象为：" + tempPerson);
            //关闭流
            obj.close();
            buf.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        readObject();
    }

}
