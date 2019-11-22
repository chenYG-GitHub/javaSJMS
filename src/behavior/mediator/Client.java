package behavior.mediator;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/15 22:15
 * @description : 中介者模式测试客户端
 * @modified By :
 */
public class Client {
    public static void main(String[] args){

        /* *
         * 什么是中介者模式：
         *
         *
         * 作用：
         *     如果系统中的对象之间存在多对多的相互关关系，可以将对象之间的一些交互行为从各个对象中分离出来
         *     机中分装在一个中介者对象中
         *
         * 优点：
         *
         *
         * 缺点：
         *
         * */

        Button button = new Button();
        TestBox testBot = new TestBox();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        ConcreteMediator mediator = new ConcreteMediator(button,testBot,list,comboBox);

        list.changed();
    }

}
