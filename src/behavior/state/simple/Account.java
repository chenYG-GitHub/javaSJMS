package behavior.state.simple;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/13 23:31
 * @description : 账户类，包含账户状态
 * @modified By :
 */
public class Account {

    /** 账户状态 */
    private BaseAccountState state;
    /** 开户名称 */
    private String owner;
    /** 账户金额 */
    private double balance = 0d;


    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为：" + balance);
        System.out.println("--------------------------------------------------");
    }

    public void setState(BaseAccountState state) {
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);
        System.out.println("当前余额为" + this.balance);
        System.out.println("当前账户状态为" + this.state.getClass().getName());
        System.out.println("--------------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "区块" + amount);
        state.withdraw(amount);
        System.out.println("当前余额为" + this.balance);
        System.out.println("当前账户状态为" + this.state.getClass().getName());
        System.out.println("--------------------------------------------------");
    }

    public void computeInterest(){
        state.computeInterest();
    }
}
