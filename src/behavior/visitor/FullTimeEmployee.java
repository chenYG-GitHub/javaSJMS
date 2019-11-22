package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/11 23:04
 * @description : 全职员工类，充当元数的具体实现
 * @modified By :
 */
public class FullTimeEmployee extends BaseEmployee {

    public FullTimeEmployee(String name, double weeklyWage, int workTime) {
        super(name, weeklyWage, workTime);
    }
}
