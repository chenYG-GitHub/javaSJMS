package behavior.state.share;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 0:05
 * @description : 开关对象，拥有一个共享状态
 * @modified By :
 */
public class Switch {

    private static BaseSwitchState current, off, on;
    private String name;

    public Switch(String name) {
        this.name = name;
        on = new OnState();
        off = new OffState();
        current = on;
    }

    public void setState(BaseSwitchState state) {
        current = state;
    }

    public static BaseSwitchState getState(String type) {
        if (type.equalsIgnoreCase("on")) {
            return on;
        } else {
            return off;
        }
    }

    public void on(){
        System.out.println(name);
        current.on(this);
    }

    public void off(){
        System.out.println(name);
        current.off(this);
    }
}
