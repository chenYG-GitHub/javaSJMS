package behavior.visitor;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/12 0:10
 * @description : 访问者模式测试客户端
 * @modified By :
 */
public class Client {

    public static void main(String[] args){

        /* *
         * 什么是访问者模式：
         *     访问者访问被访问者， 被访问者提供接口接受访问者的访问， 由具体的访问者实现逻辑进行具体的访问操作
         * 它可以让用户在不改变各元素的类的前提下定义作用与这些类的新的操作。
         *
         * 作用：
         *     当系统中存在一个复杂的对象，且不同的访问者对他们执行的操作也不同时，可以考虑使用该模式。比如：
         *         Xml文档解析，编译器设计，复杂集合对象的处理
         *
         * 优点：
         *     符合开闭原则，有利于代码复用，让用户在不修改现有元素结构的情况下定义作用与该层次的结构操作
         *
         * 缺点：
         *     每增加一个新的元素就需要在抽象访问者对象中增加一个新的抽象操作
         *     访问者模式要求被访问者对象必须暴露自己的内部操作
         * */

        BaseDepartment fa = new FADepartment();
        fa.addEmployee(new FullTimeEmployee("张三", 2394, 45));
        fa.addEmployee(new FullTimeEmployee("李四", 2346, 34));
        fa.addEmployee(new FullTimeEmployee("王五", 2145, 22));
        fa.addEmployee(new PartTimeEmployee("赵六", 22, 29));
        BaseDepartment hr = new HRDepartment();
        hr.addEmployee(new FullTimeEmployee("陈七", 1763, 48));
        hr.addEmployee(new FullTimeEmployee("刘八", 2222, 39));
        hr.addEmployee(new PartTimeEmployee("老九", 25, 34));
        hr.addEmployee(new PartTimeEmployee("以十", 22, 29));

        hr.visit(new FullTimeEmployee("陈七", 1763, 48));



    }



}
