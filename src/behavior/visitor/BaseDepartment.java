package behavior.visitor;

import basic.XMLUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/11 22:43
 * @description : 部门抽象类，充当抽象访问者
 * @modified By :
 */
public abstract class BaseDepartment implements Department{

    public static class DepartmentFactory {
        public static BaseDepartment createDepartment(String name){
            Object result = XMLUtil.getBean(name);
            if (result instanceof BaseDepartment) {
                return (BaseDepartment) result;
            }
            return null;
        }
    }

    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    @Override
    public void visit(){
        for (Employee employee : employees) {
            employee.accept(this);
        }
    };

    @Override
    public void visit(Employee employee) {
        if (employee instanceof FullTimeEmployee){
            visit((FullTimeEmployee)employee);
        } else if (employee instanceof PartTimeEmployee) {
            visit((PartTimeEmployee)employee);
        }
    }



    /**
     * 实现访问全职员工
     * @param employee 全职员工
     */
    protected abstract void visit(FullTimeEmployee employee);

    /**
     * 实现访问兼职员工
     * @param employee 兼职员工
     */
    protected abstract void visit(PartTimeEmployee employee);


}
