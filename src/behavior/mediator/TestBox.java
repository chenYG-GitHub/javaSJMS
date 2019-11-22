package behavior.mediator;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/15 22:02
 * @description : 文本框类，充当具体同事类
 * @modified By :
 */
public class TestBox extends BaseComponent{
    @Override
    public void update() {
        System.out.println(" 客户信息增加成功后文本框清空 ");
    }


    public void setText() {
        System.out.println(" 文本框显示小龙女 ");
    }
}
