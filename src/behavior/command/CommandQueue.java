package behavior.command;

import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 16:27
 * @description : 命令队列
 * @modified By :
 */
public class CommandQueue {

    private Queue<Command> commandQueue = new LinkedBlockingQueue<>();

    public void add(Command command){
        commandQueue.add(command);
    }

    public void execute(){
        while (true) {
            Command command = commandQueue.peek();
            command.execute();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
