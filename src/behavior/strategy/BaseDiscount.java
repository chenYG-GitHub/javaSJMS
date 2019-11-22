package behavior.strategy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 17:00
 * @description : 抽象折扣类
 * @modified By :
 */
public abstract class BaseDiscount implements Discount {

    protected double discount = 1;
    protected String type = "正常票";

    protected void println(double price){
        System.out.println(type + "价格为：" + price);
    }


}
