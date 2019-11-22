package behavior.command;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:40
 * @description : 功能按键类，充当请求调用者
 * @modified By :
 */
public class FunctionButton {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        System.out.println("点击功能按键：执行" + command.getName());
        command.execute();
    }

}
