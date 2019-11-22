package behavior.state.share;

/**
 * @author : chenyg
 * @version : $
 * @date : Created in 2019/11/14 0:10
 * @description :
 * @modified By :
 */
public class OffState extends BaseSwitchState {
    @Override
    public void on(Switch s) {
        System.out.println("打开");
        s.setState(Switch.getState("on"));
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭");
    }
}
