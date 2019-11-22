package behavior.interpreter;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:47
 * @description : 解释器模式测试客户端
 * @modified By :
 */
public class Client {
    public static void main(String[] args){

        /* *
         * 什么是解释器模式：
         *     解释器模式就是用来解释一个语言在系统中的操作规则
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


        String instruction = "down run 10 and left move 20";
        InstructionHandler handler = new InstructionHandler();
        handler.handler(instruction);

        String output;
        output = handler.output();
        System.out.println(output);
    }
}
