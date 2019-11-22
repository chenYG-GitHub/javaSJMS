package behavior.strategy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 16:59
 * @description : 学生票折扣类
 * @modified By :
 */
public class StudentDiscount extends BaseDiscount{

    public StudentDiscount() {
        super();
        super.discount = 0.8;
        super.type = "学生票";
    }

    @Override
    public double calculate(double price) {
        double result = price * discount;
        println(result);
        return result;
    }
}
