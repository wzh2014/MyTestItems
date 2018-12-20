package demo.EnumDemo;

/**
 * 请填写类注释
 *
 * @author zhihong.wan
 * @since 2018年10月17日
 */
public enum Enum3 {

    BANK(0, "银行"),
    SALE_RENT(1, "售后回租"),
    TRUST(2, "信托"),
    BOND(3, "债券"),
    ABS(4, "ABS"),
    OTHERS(5, "其他");

    /**
     * 集团体系代码
     */
    private Integer code;

    /**
     * 集团体系汉字
     */
    private String value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    Enum3(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    /**
     * 取融资模式汉字
     * @param code 代码
     * @return 值
     */
    public static String getValuesByCode(int code) {
        if(code == Enum3.BANK.getCode()) {
            return Enum3.BANK.getValue();
        } else if(code == Enum3.SALE_RENT.getCode()) {
            return Enum3.SALE_RENT.getValue();
        } else if(code == Enum3.TRUST.getCode()) {
            return Enum3.TRUST.getValue();
        } else if(code == Enum3.BOND.getCode()) {
            return Enum3.BOND.getValue();
        } else if(code == Enum3.ABS.getCode()) {
            return Enum3.ABS.getValue();
        } else {
            return Enum3.OTHERS.getValue();
        }
    }
}
