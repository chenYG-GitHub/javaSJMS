package behavior.state.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/13 23:35
 * @description : 正常状态类
 * @modified By :
 */
public class NormalState extends BaseAccountState {

    public NormalState(Account account) {
        super.account = account;
    }

    public NormalState(BaseAccountState state) {
        super.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态，无需支付利息");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > -2000 && account.getBalance() <= 0) {
            account.setState(new OverdraftState(this));
        } else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        } else {
            System.out.println("操作受限");
        }

    }
}
