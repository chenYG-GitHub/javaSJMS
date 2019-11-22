package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:51
 * @description : 帮助命令类，充当具体接收者
 * @modified By :
 */
public class HelpCommand extends BaseCommand {

    public HelpCommand() {
        super(new DisplayHelpClass());
    }

    @Override
    public String getName() {
        return "帮助命令";
    }
}
