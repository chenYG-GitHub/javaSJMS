package behavior.interpreter;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/16 21:16
 * @description :  抽象节点类，充当抽象表达式角色
 * @modified By :
 */
public abstract class AbstractNode {

    /**
     * 需要解释的操作
     * @return 解释结果
     */
    public abstract String interpret();

}
