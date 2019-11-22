package behavior.strategy;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 16:56
 * @description : 电影票，充当环境类
 * @modified By :
 */
public class MovieTicket {

    private double price;
    private Discount discount;

    public MovieTicket(double price, Discount discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(price);
    }
}
