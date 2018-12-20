package demo.IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File file = new File("C:\\Users/zhihong.wan/Desktop/note.txt");

            fis = new FileInputStream(file);
            fos = new FileOutputStream("C:\\Users/zhihong.wan/Desktop/newnote.txt");

            byte[] buf = new byte[1024];

            int hasRead;

            while((hasRead = fis.read(buf)) > 0) {
                fos.write(buf, 0, hasRead);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fis.close();
            fos.close();
        }
    }
}
