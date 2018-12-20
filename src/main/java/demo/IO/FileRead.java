package demo.IO;

import java.io.*;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月19日
 */
public class FileRead {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users/zhihong.wan/Desktop/note.txt");
        if(!file.exists()) {
            throw new RuntimeException("要读取的文件不存在！");
        }
        FileReader FR = null;
        try {

            FR = new FileReader(file);
            int len;
            char[] buf = new char[512];

            while((len = FR.read(buf)) != -1) {
                String str = new String(buf, 0, len);

                System.out.println(new String(str.getBytes("utf-8"), "utf-8"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            FR.close();
        }

    }
}
