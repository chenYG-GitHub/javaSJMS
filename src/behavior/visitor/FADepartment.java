package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/11 23:47
 * @description : 财务部门，充当具体的访问者
 * @modified By :
 */
public class FADepartment extends BaseDepartment {
    @Override
    protected void visit(FullTimeEmployee employee) {
        double weekWage = 0d;
        if (employee.getWorkTime() > 40) {
            weekWage = employee.getWeeklyWage() + (employee.getWorkTime() - 40) * 100;
        } else if (employee.getWorkTime() < 40 && employee.getWorkTime() > 0){
            weekWage = employee.getWeeklyWage() - (40 - employee.getWorkTime()) * 80;
        }
        println("正式", employee.getName(),weekWage);
    }

    @Override
    protected void visit(PartTimeEmployee employee) {
        println("零时", employee.getName(),employee.getWeeklyWage());
    }


    private void println(final String type, final String name, final double weekWage){
        System.out.println(type + "员工【" + name + "】实际工资为：" + weekWage);
    }
}
