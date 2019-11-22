package behavior.strategy;

import basic.XMLUtil;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 17:11
 * @description : 策略模式测试客户端
 * @modified By :
 */
public class Client {
    public static void main(String[] args){

        /* *
         * 什么是策略模式：
         *     比如游客外出旅游时，可以根据自己的具体情况选择出行方式，如自行车，坐飞机等等；
         *     而策略模式指的就是用户可以根据实际情况选择需要的策略来解决实际问题。
         *
         * 作用：
         *     策略模式让算法可以独立于使用它的客户端而变化
         *
         * 优点：
         *
         *
         * 缺点：
         * */

        Discount discount = (Discount) XMLUtil.getBean("Strategy");
        new MovieTicket(100, discount).getPrice();


    }



}
