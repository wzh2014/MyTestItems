package demo.IO;

import java.io.IOException;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class FileInputStream {
    public static void main(String[] args) throws IOException {
        java.io.FileInputStream fis = null;
        try {
            //创建字节输入流
            fis = new java.io.FileInputStream("C:\\Users/zhihong.wan/Desktop/note.txt");
            //创建一个长度为1024的竹筒
            byte[] b = new byte[1024];
            //用于保存的实际字节数
            int hasRead = 0;
            //使用循环来重复取水的过程
            while((hasRead = fis.read(b)) > 0) {
                //取出竹筒中的水滴（字节），将字节数组转换成字符串进行输出
                System.out.print(new String(b, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }
    }
}
