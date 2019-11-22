package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:38
 * @description : 命令接口
 * @modified By :
 */
public interface Command {

    /**
     * 命令执行
     */
    void execute();

    /**
     * 命令名称
     * @return 命令名称
     */
    String getName();

}
