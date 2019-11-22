package structure.proxy.virtual;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 21:35
 * @description : 虚拟代理测试客户端
 * @modified By :
 */
public class Client {

    public static void main(String[] args) {
        // 有很多人来找老板, 老板在忙, 助手先把所有事情安置好
        Assistant assistant = new Assistant();
        assistant.addOrder("我找Boss面试");
        assistant.addOrder("我找Boss借钱");
        assistant.addOrder("我找Boss聊天");

        // 收集好了, 助手的职责就完成了, 把Boss叫出来, 让Boss处理. 或者说approve这件事,助手是做不了的, 只能叫出Boss来做.
        assistant.approve();

        // Boss刚才就被邀请过来, 现在就在现场. 所以就不需要助手转告给Boss了. 大家告诉助手的事情, Boss也会听到
        assistant.addOrder("我找Boss吃饭");
        assistant.addOrder("我找Boss喝酒");
        assistant.approve();
    }
}
