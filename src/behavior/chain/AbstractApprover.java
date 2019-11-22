package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:42
 * @description : 审批者，充当抽象处理者
 * @modified By :
 */
public abstract class AbstractApprover {


    protected AbstractApprover next;
    private String name;

    public AbstractApprover(String name) {
        this.name = name;
    }

    public void setNext(AbstractApprover next) {
        this.next = next;
    }

    /**
     * 具体处理订单的方法
     * @param request 订单
     */
    public abstract void processRequest(PurchaseRequest request);


    protected void println(PurchaseRequest request){
        System.out.println("[" + this.name + "]审批采购单：" + request.getNumber() + ", 金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
    }
}
