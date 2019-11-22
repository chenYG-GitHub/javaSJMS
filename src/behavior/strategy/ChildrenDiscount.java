package behavior.strategy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 17:07
 * @description : 儿童票
 * @modified By :
 */
public class ChildrenDiscount extends BaseDiscount {

    public ChildrenDiscount() {
        super();
        super.discount = 10;
        super.type = "儿童票";
    }

    @Override
    public double calculate(double price) {
        double result = price - discount;
        if (result < 0) {
            result = price;
        }
        println(result);
        return result;
    }
}
