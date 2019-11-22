package structure.flyweight;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:54
 * @description : 白色棋子，充当具体享元类
 * @modified By :
 */
public class WhiteGoChessman extends AbstractGoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
