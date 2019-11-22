package behavior.mediator;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/15 22:00
 * @description : 组合框，充当具体同事类
 * @modified By :
 */
public class ComboBox extends BaseComponent {
    @Override
    public void update() {
        System.out.println(" 组合框增加一项：张无忌 ");
    }

    public void select(){
        System.out.println(" 组合框选中项：小龙女 ");
    }
}
