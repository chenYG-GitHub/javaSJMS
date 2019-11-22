package behavior.state.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/13 23:56
 * @description : 状态模式客户端测试类
 * @modified By :
 */
public class Client {

    public static void main(String[] args){


        /* *
         * 什么是状态模式：
         *     比如银行卡充值与提现时，可以根据银行卡的状态决定用户是否可以进行提现与充值操作，
         *     如：
         *         银行卡透支时，可以不让用户进行取款，只能存钱，并根据用户的金额变化改变银行卡的状态
         *
         * 作用：
         *     允许当状态发生变化时改变状态所属对象的行为
         *
         * */


        Account account = new Account("陈杨国", 1000);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.withdraw(2000);
        account.computeInterest();
    }

}
