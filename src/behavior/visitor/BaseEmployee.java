package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/11 23:08
 * @description : 基础员工，用来实现员工接口
 * @modified By :
 */
public abstract class BaseEmployee implements Employee {

    /** 员工姓名 */
    private String name;
    /** 员工周薪 */
    private double weeklyWage;
    /** 员工工作时间 */
    private int workTime;

    public BaseEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(BaseDepartment department) {
        department.visit(this);
    }
}
