package behavior.memento;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/14 22:24
 * @description : 备忘录模式客户端
 * @modified By :
 */
public class Client {
    public static void main(String[] args){
        /* *
         * 什么是备忘录模式：
         *     备忘录模式就是在用户进行操作时，可以保留上一次的操作状态，然后当用户操作失误时，提供撤销的方法返回上一步的操作状态。
         *
         * 作用：
         *     在不破坏封装的前提下捕获一个对象的内部状态，并将这个状态保留起来，使之可以恢复原先的状态。
         *
         * 优点：
         *
         *
         * 缺点：
         *
         * */
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chessman = new Chessman("车", 1, 1);
        display(chessman);
        mc.setMemento(chessman.save());
        chessman.setX(4);
        display(chessman);
        mc.setMemento(chessman.save());
        chessman.setX(8);
        display(chessman);
        chessman.restore(mc.getMemento());
        display(chessman);

    }

    public static void display(Chessman chessman) {
        System.out.println("棋子" + chessman.getLabel() + "当前位置：" + "第" + chessman.getX() + "行，" + "第" + chessman.getY() + "列");
    }
}
