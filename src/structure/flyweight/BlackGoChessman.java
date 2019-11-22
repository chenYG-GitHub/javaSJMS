package structure.flyweight;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:54
 * @description : 黑色棋子，充当具体享元类
 * @modified By :
 */
public class BlackGoChessman extends AbstractGoChessman {
    @Override
    public String getColor() {
        return "黑色";
    }
}
