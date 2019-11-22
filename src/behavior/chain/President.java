package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:51
 * @description : 董事长
 * @modified By :
 */
public class President extends AbstractApprover {
    public President(String name) {
        super("董事长：" + name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            println(request);
        }else {
            this.next.processRequest(request);
        }
    }
}
