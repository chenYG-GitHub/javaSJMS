package behavior.state.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/13 23:45
 * @description : 透支状态
 * @modified By :
 */
public class OverdraftState extends BaseAccountState {

    public OverdraftState(Account account) {
        super.account = account;
    }

    public OverdraftState(BaseAccountState state) {
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
        System.out.println("计算利息");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        } else if (account.getBalance() < -2000 ){
            System.out.println("操作受限");
        }
    }
}
