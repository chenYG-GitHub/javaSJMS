package behavior.observer;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 21:29
 * @description : 具体指挥部，充当具体目标类
 * @modified By :
 */
public class ConcreteAllyControlCenter extends BaseAllyControlCenter{

    public ConcreteAllyControlCenter(String name) {
        super();
        super.allyName = name;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知：" + name + "正在受到功击！");
        for (Observer player : super.players) {
            if (!player.getName().equals(name)){
                player.help();
            }
        }
    }
}
