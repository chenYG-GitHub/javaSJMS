package behavior.strategy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 16:49
 * @description : 折扣类，充当策略接口
 * @modified By :
 */
public interface Discount {

    /**
     * 根据价格计算最终的折扣
     * @param price
     * @return
     */
    double calculate(double price);

}
