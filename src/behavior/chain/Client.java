package behavior.chain;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:54
 * @description : 职责链模式测试
 * @modified By :
 */
public class Client {

    public static void main(String[] args){

        AbstractApprover zwj, hr, yg, gj, meeting;
        zwj = new Director("张无忌");
        hr = new Manager("黄蓉");
        yg = new VicePresident("杨过");
        gj = new President("郭靖");
        meeting = new Congress("董事会");

        // 创建职责链
        zwj.setNext(hr);
        hr.setNext(yg);
        yg.setNext(gj);
        gj.setNext(meeting);

        // 创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"购买倚天剑");
        zwj.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"购买《葵花宝典》");
        zwj.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"购买《金刚经》");
        zwj.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"购买桃花岛");
        zwj.processRequest(pr4);





    }



}
