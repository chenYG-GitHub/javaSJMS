package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:45
 * @description : 主任类，充当具体处理者
 * @modified By :
 */
public class Director extends AbstractApprover {

    public Director(String name) {
        super("主任：" + name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            println(request);
        }else {
            // 请求转发
            this.next.processRequest(request);
        }
    }
}
