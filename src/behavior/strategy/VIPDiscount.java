package behavior.strategy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 17:09
 * @description : VIP票
 * @modified By :
 */
public class VIPDiscount extends BaseDiscount {

    public VIPDiscount() {
        super();
        super.discount = 0.5;
        super.type = "学生票";
    }
    @Override
    public double calculate(double price) {
        double result = price * discount;
        println(result);
        return result;
    }
}
