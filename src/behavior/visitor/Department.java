package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/11 23:35
 * @description : 部门接口类，抛出特定的接口提供别人调用
 * @modified By :
 */
public interface Department {

    /***
     * 访问全部
     */
    void visit();

    /**
     * 访问指定成员
     * @param employee 成员
     */
    void visit(Employee employee);

}
