package structure.proxy.virtual;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 20:53
 * @description : 老板类
 * @modified By :
 */
public class Boss implements Approvable {
    List<String> orders;
 
    {
        System.out.println("\nBoss出现...\n");
    }
 
    public Boss() {
        this.orders = new LinkedList<>();
    }
 
    public Boss(List<String> orders) {
        if (orders != null) {
            this.orders = orders;
        } else {
            this.orders = new LinkedList<>();
        }
    }
 
    public void addOrder(String order) {
        this.orders.add(order);
    }
 
    @Override
    public void approve() {
        while(orders.size()>0){
            String order = orders.remove(0);
            System.out.println("Boss处理了任务<" + order + ">");
        }
        System.out.println();
    }
}