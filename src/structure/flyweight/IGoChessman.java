package structure.flyweight;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:50
 * @description : 围棋棋子接口
 * @modified By :
 */
public interface IGoChessman {

    /**
     * 获取棋子颜色
     * @return 棋子颜色
     */
    String getColor();

    /**
     * 显示棋子
     */
    void display(Coordinates coordinates);

}
