package demo.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年07月20日
 */
public class InputStreamReaderTest {
    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String buffer;
            System.out.println("请输入需要打印的字符串(打印exit退出)：");
            while((buffer = bufferedReader.readLine()) != null) {
                if(buffer.equals("exit")) {
                    System.exit(1);
                }

                System.out.println(buffer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }


    }

}
