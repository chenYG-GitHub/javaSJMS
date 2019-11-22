package behavior.interpreter;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:18
 * @description : 距离节点类，充当终结符表达式
 * @modified By :
 */
public class DistanceNode extends AbstractNode {

    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return distance;
    }
}
