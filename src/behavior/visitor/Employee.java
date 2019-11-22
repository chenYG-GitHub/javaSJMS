package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/11 23:01
 * @description : 员工类，充当抽象元数类
 * @modified By :
 */
public interface Employee {

    /**
     * 用来接收一个抽象访问者访问
     * @param department 抽象访问者
     */
    void accept(BaseDepartment department);
}
