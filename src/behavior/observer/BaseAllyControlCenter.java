package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 21:19
 * @description : 指挥部，充当抽象目标类
 * @modified By :
 */
public abstract class BaseAllyControlCenter {

    /** 战队名称 */
    protected String allyName;
    /** 战队成员 */
    protected List<Observer> players = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    /**
     * 战队成员加入战队
     * @param observer 战队成员
     */
    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "战队");
        players.add(observer);
    }

    /**
     * 战队成员退出战队
     * @param observer 战队成员
     */
    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allyName + "战队");
        players.remove(observer);
    }

    /**
     * 通知方法
     * @param name
     */
    public abstract void notifyObserver(String name);
}
