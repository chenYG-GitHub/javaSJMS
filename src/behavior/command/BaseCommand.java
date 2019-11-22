package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:53
 * @description : 基础命令
 * @modified By :
 */
public abstract class BaseCommand implements Command {

    private CommandReceive receive;

    public BaseCommand(CommandReceive receive) {
        this.receive = receive;
    }

    @Override
    public void execute() {
        receive.receive(this);
    }



}
