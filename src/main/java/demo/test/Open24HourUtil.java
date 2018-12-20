package demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 根据特来电和星星的营业时间格式返回对应哪几天营业的十进制数
 *
 * @author zhihong.wan
 * @since 2018年08月15日
 */
public class Open24HourUtil {
    private static String DEADLINE = "00:00-23:59";

    private static String DEADLINE_SEC = "00:00-24:00";

    private static String WEEK = "周";

    private static String TO = "至";

    private static String SEPARATOR = ";";

    private static String COMMA = ",";

    private static String PATTERN = "((周[一|二|三|四|五|六|日](至周[一|二|三|四|五|六|日])?(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)" +
                                    "-(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)(,(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)-(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00))*)" +
                                    "(;(周[一|二|三|四|五|六|日](至周[一|二|三|四|五|六|日])?(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)-(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)" +
                                    "(,(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)-(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00))*))*)|((((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)" +
                                    "-(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)(,(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00)-(((20|21|22|23|[0-1]\\d):[0-5]\\d)|24:00))*)";
    /**
     * 初始化周
     */
    private static Map<String,Integer> weekMap = new HashMap<String, Integer>(){{
        put("周一",6);
        put("周二",5);
        put("周三",4);
        put("周四",3);
        put("周五",2);
        put("周六",1);
        put("周日",0);
    }};

    /**
     * 判断日期格式，如果为空或者格式错误则返回null，正确则反映总营业时间对应的Integer
     * @param str
     * @return Integer
     */
    public static Integer finalMatch(String str) {
        if(str == null){
            return null;
        }
        Integer result = 0;
        Pattern r = Pattern.compile(PATTERN);
        Matcher m = r.matcher(str);
        if(!m.matches()) {
            return null;
        }
        String[] strings = str.split(SEPARATOR);

        for(int i = 0; i < strings.length; i++) {
             if(match(strings[i]) >= 0) {
                result = result | match(strings[i]);
            }
        }
        return result;
    }

    /**
     * 对单个时间段进行匹配对应的Integer
     * @param string
     * @return Integer
     */
    public static Integer match(String string) {
        String time;
        String from;
        String to;

        if(string.contains(COMMA)) {
            return 0;
        }

        if(!string.contains(WEEK)) {
            time = string;
            return getInteger(time);
        } else if(string.contains(TO)) {
            time = string.substring(5);
            from = string.substring(3, 5);
            to = string.substring(0, 2);
        } else {
            time = string.substring(2);
            from = to = string.substring(0, 2);
        }
        char[] result = {'0', '0', '0', '0', '0', '0', '0'};
        for(int j = getWeek(from); j <= getWeek(to); j++) {
            if(DEADLINE.equals(time) || DEADLINE_SEC.equals(time)) {
                result[j] = '1';
            }
        }
        return MathUtil.binary2Decimal(String.valueOf(result));
    }

    /**
     * 对星星充电的营业时间匹配
     * @param time
     * @return Integer
     */
    private static Integer getInteger(String time) {
        if(DEADLINE.equals(time) || DEADLINE_SEC.equals(time)) {
            return 127;
        } else {
            return 0;
        }
    }

    /**
     * 根据周获取规定的值
     * @param string
     * @return Integer
     */
    public static Integer getWeek(String string) {
        return weekMap.get(string);
    }
}
