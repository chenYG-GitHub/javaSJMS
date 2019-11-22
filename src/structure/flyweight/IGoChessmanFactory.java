package structure.flyweight;

import java.util.Hashtable;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/17 22:56
 * @description : 围棋棋子工厂，充当享元工厂类
 * @modified By :
 */
public class IGoChessmanFactory {
    private static IGoChessmanFactory factory = new IGoChessmanFactory();
    private static Hashtable<String, IGoChessman> ht;

    private IGoChessmanFactory() {
        ht = new Hashtable<>();
        IGoChessman black, white;
        black = new BlackGoChessman();
        white = new WhiteGoChessman();
        ht.put("b", black);
        ht.put("w", white);
    }

    public static IGoChessmanFactory getInstance(){
        return factory;
    }

    public IGoChessman getIGoChessman(String color) {
        return ht.get(color);
    }

}
