package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:44
 * @description : 命令接收者接口，充当请求接收者
 * @modified By :
 */
public interface CommandReceive {

    /**
     * 接收命令
     * @param command 命令
     */
    void receive(Command command);

}
