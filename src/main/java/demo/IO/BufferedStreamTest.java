package demo.IO;

import java.io.*;
import java.io.FileInputStream;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class BufferedStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        FileOutputStream fos;
        BufferedInputStream bfis = null;
        BufferedOutputStream bfos = null;

        try {
            fis = new FileInputStream("C:\\Users/zhihong.wan/Desktop/note.txt");
            fos = new FileOutputStream("C:\\Users/zhihong.wan/Desktop/newnote.txt");
            bfis = new BufferedInputStream(fis);
            bfos = new BufferedOutputStream(fos);

            byte[] buf = new byte[1024];

            int hasRead;

            while((hasRead = bfis.read(buf)) > 0) {
                bfos.write(buf, 0, hasRead);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bfis.close();
            bfos.close();
        }
    }
}
