package demo.ProducerAndConsumer;

/**
 * 容器数据类型
 *
 * @author zhihong.wan
 * @since 2018年07月24日
 */
public class PCData {
    private final int intData;
    public PCData(int d){
        intData = d;
    }
    public PCData(String d){
        intData = Integer.valueOf(d);
    }
    public int getData(){
        return intData;
    }
    @Override
    public String toString(){
        return "data:"+intData;
    }
}
