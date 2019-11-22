package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:47
 * @description : 基础命令接收者
 * @modified By :
 */
public abstract class BaseReceive<T extends Command> implements CommandReceive {
    @Override
    public void receive(Command command) {
        execute((T) command);
    }

    protected abstract void execute(T command);

}
