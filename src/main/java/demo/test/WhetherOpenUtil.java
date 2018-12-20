package demo.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 判断当天是否营业
 *
 * @author zhihong.wan
 * @since 2018年08月08日
 */
public class WhetherOpenUtil {

    private static Date today = new Date();

    public static int isOpen(String str) {
        int a = toInteger(str);
        int minValue = 0;
        int maxValue = 127;
        if(a < minValue || a > maxValue) {
            return  0;
        }
//        int b = getWeek(today);
//        if((a & b) == b) {
//            return 1;
//        } else {
//            return 0;
//        }
        return 0;
    }

    public static int getWeek(String str) {
        /**
         * week数组的下标分别表示周日到周六
         * 64的二进制为01000000，第7位为1表示周日，剩下同理
         */
        Date date;
        int[] weeks = {64, 1, 2, 4, 8, 16, 32};
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        try {
            date = sdf.parse(str);
            cal.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int weekIndex = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if(weekIndex < 0) {
            weekIndex = 0;
        }
        return weeks[weekIndex];
    }
    /**
     *将7位的字符串转化为十进制的数 如果不是7位则返回-1
     */
    public static Integer toInteger(String str) {
        int Maxlen = 7;
        Integer result = 0;
        if(str.length()!= Maxlen) {
            return -1;
        }
        StringBuffer sb = new StringBuffer(str);
        String reverseStr = sb.reverse().toString();
        char[] chars = reverseStr.toCharArray();
        for(int i = 0; i <chars.length; i++) {
            if(chars[i]=='1'){
                result += (int)Math.pow(2, i);
            }
        }
        return result;
    }
}
