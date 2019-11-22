package behavior.state.share;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 0:06
 * @description : 基础共享状态类
 * @modified By :
 */
public abstract class BaseSwitchState {

    public abstract void on(Switch s);
    public abstract void off(Switch s);

}
