package behavior.observer;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 21:35
 * @description : 观察者模式客户端
 * @modified By :
 */
public class Client {

    public static void main(String[] args){

        /* *
         * 什么是观察者模式：
         *     观察者模式又叫做发布-订阅模式，模型-视图模式，源-侦听器模式，从属者模式，是最常用的设计模式之一，并且JDK均添加了对该模式的支持。
         *     观察者模式指的是一个被观察者对象发生变化时，将会通知其他观察者对象，其他的观察者将会做出反应
         *
         * 作用：
         *     用于描述对象之间的依赖关系，实现了多个对象联动
         *
         * 优点：
         *
         *
         * 缺点：
         *
         * */


        BaseAllyControlCenter jyqs = new ConcreteAllyControlCenter("金庸群侠");
        Observer player1, player2, player3, player4;
        player1 = new Player();
        player1.setName("杨过");
        player2 = new Player();
        player2.setName("小龙女");
        player3 = new Player();
        player3.setName("拎壶冲");
        player4 = new Player();
        player4.setName("飞天女警");
        jyqs.join(player1);
        jyqs.join(player2);
        jyqs.join(player3);
        jyqs.join(player4);
        player1.beAttacked(jyqs);
    }

}
