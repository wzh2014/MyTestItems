package demo.IO;

import java.io.*;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class writeObjectTest {
    public static void writeObject() {

        OutputStream outputStream;

        BufferedOutputStream buf;

        ObjectOutputStream obj;

        try {
            //序列化文件輸出流
            outputStream = new FileOutputStream("C:\\Users/zhihong.wan/Desktop/person.tmp");
            //构建缓冲流
            buf = new BufferedOutputStream(outputStream);
            //构建字符输出的对象流
            obj = new ObjectOutputStream(buf);
            //序列化数据写入
            //Person对象
            obj.writeObject(new Person("wzh", 23));
            //关闭流
            obj.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        writeObject();
    }
}

