package behavior.observer;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 21:20
 * @description : 观察者接口
 * @modified By :
 */
public interface Observer {

    /** 获得观察者名称
     * @return 观察者名称
     * */
    public String getName();

    /**
     * 设置观察者名称
     * @param name 观察者名称
     */
    public void setName(String name);

    /**
     * 观察者声明支援盟友的方法
     */
    public void help();

    /**
     * 声明遭受功击的方法
     * @param allyControlCenter 指挥部
     */
    public void beAttacked(BaseAllyControlCenter allyControlCenter);

}
