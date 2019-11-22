package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 0:02
 * @description : 人力资源部门，充当具体的访问者
 * @modified By :
 */
public class HRDepartment extends BaseDepartment {
    @Override
    protected void visit(FullTimeEmployee employee) {
        println("正式", employee.getName(),"实际工作时间", employee.getWorkTime() + "");
        if (employee.getWorkTime() > 40) {
            println("正式", employee.getName(), "加班时间", (employee.getWorkTime() - 40) + "");
        } else {
            println("正式", employee.getName(), "请假时间", (40 - employee.getWorkTime()) + "");
        }

    }

    @Override
    protected void visit(PartTimeEmployee employee) {
        println("零时", employee.getName(), "实际工作时间", employee.getWorkTime() + "");
    }


    private void println(String type, String name, String key, String value) {
        System.out.println(type + "员工【" + name + "】" + key + "：" + value + "小时");
    }
}
