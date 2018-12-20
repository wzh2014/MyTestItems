package demo.test;

import org.apache.commons.lang3.StringUtils;
/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年08月08日
 */
public class MathUtil {
    /**
     *将7位的字符串转化为十进制的数 如果不是7位则返回-1
     */
//    private static Integer toInteger(String str) {
//        int Maxlen = 7;
//        Integer result = 0;
//        if(str.length()!= Maxlen) {
//            return -1;
//        }
//        StringBuffer sb = new StringBuffer(str);
//        String reverseStr = sb.reverse().toString();
//        char[] chars = reverseStr.toCharArray();
//        for(int i = 0; i <chars.length; i++) {
//            if(chars[i]=='1'){
//                result += (int)Math.pow(2, i);
//            }
//        }
//        return result;
//    }
    public static void main(String[] args) {
        System.out.println(binary2Decimal("1111111"));
    }

    private MathUtil() {
    }

    /**
     * 将二进制转换为10进制
     * @param numberStr
     * @return
     */
    public  static  Integer binary2Decimal(String numberStr){
        if(StringUtils.isBlank(numberStr) || !StringUtils.isNumeric(numberStr)) {
            return null;
        }
        Integer sum = 0;
        int len = numberStr.length();
        for (int i=1;i<=len;i++){
            //第i位 的数字为：
            int dt = Integer.parseInt(numberStr.substring(i-1,i));
            sum+=(int)Math.pow(2,len-i)*dt;
        }
        return  sum;
    }
}
