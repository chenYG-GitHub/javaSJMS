package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:52
 * @description : 董事会
 * @modified By :
 */
public class Congress extends AbstractApprover {

    public Congress(String name) {
        super("召开董事会：" + name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        println(request);
    }
}
