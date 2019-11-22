package behavior.mediator;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/15 22:09
 * @description : 列表框，充当具体同事类
 * @modified By :
 */
public class List extends BaseComponent {
    @Override
    public void update() {
        System.out.println(" 列表框增加一项：张无忌 ");
    }

    public void select(){
        System.out.println(" 列表框选中项：小龙女 ");
    }
}
