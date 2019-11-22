package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:52
 * @description : 显示帮助命令，充当具体接收者
 * @modified By :
 */
public class DisplayHelpClass extends BaseReceive<HelpCommand> {
    @Override
    protected void execute(HelpCommand command) {
        System.out.println("显示帮助文档");
    }
}
