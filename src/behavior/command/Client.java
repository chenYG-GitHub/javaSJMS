package behavior.command;

import basic.XMLUtil;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 10:58
 * @description : 命令模式测试类
 * @modified By :
 */
public class Client {
    public static void main(String[] args){

        /* *
         * 什么是命令模式：
         *
         *
         * 作用：
         *
         *
         * 优点：
         *
         *
         * 缺点：
         *
         * */


        FunctionButton button = new FunctionButton();
        button.setCommand((Command) XMLUtil.getBean("Command"));
        button.click();
    }
}
