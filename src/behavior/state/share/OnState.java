package behavior.state.share;

import behavior.state.simple.BaseAccountState;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 0:07
 * @description : 打开状态
 * @modified By :
 */
public class OnState extends BaseSwitchState {
    @Override
    public void on(Switch s) {
        System.out.println("已经打开");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭");
        s.setState(Switch.getState("off"));
    }
}
