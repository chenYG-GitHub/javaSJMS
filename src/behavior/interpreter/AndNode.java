package behavior.interpreter;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:18
 * @description : And节点类，充当非终结符表达式
 * @modified By :
 */
public class AndNode extends AbstractNode {
    /** and 左边的表达式 */
    private AbstractNode left;
    /** and 左右的表达式 */
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
