package structure.flyweight;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:52
 * @description : 围棋棋子抽象类，充当抽象享元类
 * @modified By :
 */
public abstract class AbstractGoChessman implements IGoChessman {
    @Override
    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色：" + getColor() + ", 棋子位置：" + coordinates.getX() + "," + coordinates.getY());
    }
}
