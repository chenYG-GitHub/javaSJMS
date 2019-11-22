package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:43
 * @description : 退出系统实现类，充当请求接收者
 * @modified By :
 */
public class SystemExitClass extends BaseReceive<ExitCommand>{


    @Override
    protected void execute(ExitCommand command) {
        System.out.println("退出系统");
    }
}
