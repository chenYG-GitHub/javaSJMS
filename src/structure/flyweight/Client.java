package structure.flyweight;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 23:01
 * @description : 享元模式客户端测试类
 * @modified By :
 */
public class Client {

    public static void main(String[] args){
        IGoChessman b1,b2,b3,w1,w2;
        IGoChessmanFactory factory = IGoChessmanFactory.getInstance();
        b1 = factory.getIGoChessman("b");
        b2 = factory.getIGoChessman("b");
        b3 = factory.getIGoChessman("b");
        System.out.println("判断两颗黑棋是否相同：" + (b1 == b2));

        w1 = factory.getIGoChessman("w");
        w2 = factory.getIGoChessman("w");
        System.out.println("判断两颗白棋是否相同：" + (w1 == w2));
        b1.display(new Coordinates(1,2));
        b2.display(new Coordinates(2,3));
        b3.display(new Coordinates(3,4));
        w1.display(new Coordinates(2,1));
        w2.display(new Coordinates(2,2));


    }


}
