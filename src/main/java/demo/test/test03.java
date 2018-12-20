package demo.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月07日
 */
public class test03 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(getWeek(date));
       // System.out.println(getWeek2(date));
    }

    public static String getWeek(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String week = sdf.format(date);
        return week;
    }

//    public static int getWeek2(Date date){
//        int[] weeks = {64,1,2,4,8,16,32};
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
//        if(week_index<0){
//            week_index = 0;
//        }
//        return weeks[week_index];
//    }
}
