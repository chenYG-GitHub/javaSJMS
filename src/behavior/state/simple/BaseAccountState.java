package behavior.state.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/13 23:32
 * @description : 账户状态，所有账户状态的基类
 * @modified By :
 */
public abstract class BaseAccountState {

    protected Account account;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();



}
