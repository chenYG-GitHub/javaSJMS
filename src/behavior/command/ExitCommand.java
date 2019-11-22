package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:39
 * @description : 退出命令
 * @modified By :
 */
public class ExitCommand extends BaseCommand {

    public ExitCommand() {
        super(new SystemExitClass());
    }

    @Override
    public String getName() {
        return "退出命令";
    }
}
