package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:56
 * @description : 副董事长
 * @modified By :
 */
public class VicePresident extends AbstractApprover{
    public VicePresident(String name) {
        super("副董事长：" + name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            println(request);
        }else {
            this.next.processRequest(request);
        }
    }
}
