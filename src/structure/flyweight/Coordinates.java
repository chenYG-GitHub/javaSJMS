package structure.flyweight;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 23:06
 * @description : 棋子坐标类
 * @modified By :
 */
public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
