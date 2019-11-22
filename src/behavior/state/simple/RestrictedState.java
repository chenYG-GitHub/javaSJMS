package behavior.state.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/13 23:50
 * @description : 受限状态
 * @modified By :
 */
public class RestrictedState extends BaseAccountState {

    public RestrictedState(Account account) {
        super.account = account;
    }

    public RestrictedState(BaseAccountState state) {
        super.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账户受限，当前欠费" + account.getBalance());
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
        }
    }
}
