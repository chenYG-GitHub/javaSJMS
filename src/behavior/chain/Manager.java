package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 17:02
 * @description : 经理
 * @modified By :
 */
public class Manager extends AbstractApprover {

    public Manager(String name) {
        super("经理：" + name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 80000) {
            println(request);
        }else {
            this.next.processRequest(request);
        }
    }
}
