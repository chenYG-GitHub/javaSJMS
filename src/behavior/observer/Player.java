package behavior.observer;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 21:33
 * @description : 游戏玩家，充当具体的观察者
 * @modified By :
 */
public class Player implements Observer {

    private String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    @Override
    public void beAttacked(BaseAllyControlCenter allyControlCenter) {
        System.out.println(this.name + "被功击");
        allyControlCenter.notifyObserver(this.name);
    }
}
