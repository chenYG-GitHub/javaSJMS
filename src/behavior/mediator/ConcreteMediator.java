package behavior.mediator;

/**
 * @author : chenyg
 * @version : 1.0.0$
 * @date : Created in 2019/11/15 21:50
 * @description : 具体中介者
 * @modified By :
 */
public class ConcreteMediator implements Mediator {

    private Button button;
    private TestBox testBox;
    private List list;
    private ComboBox comboBox;

    public ConcreteMediator(Button button, TestBox testBox, List list, ComboBox comboBox) {
        this.button = button;
        this.testBox = testBox;
        this.list = list;
        this.comboBox = comboBox;
        button.setMediator(this);
        testBox.setMediator(this);
        list.setMediator(this);
        comboBox.setMediator(this);
    }

    public Button getButton() {
        return button;
    }

    public TestBox getTestBox() {
        return testBox;
    }

    public List getList() {
        return list;
    }

    public ComboBox getComboBox() {
        return comboBox;
    }

    @Override
    public void componentChanged(BaseComponent component) {
        if (component == button) {
            System.out.println(" 点击了增加按钮 ");
            list.update();
            comboBox.update();
            testBox.update();
        }else if (component == list) {
            System.out.println(" 从列表框选择了客户了 ");
            list.select();
            testBox.setText();
        } else if (component == comboBox) {
            System.out.println(" 从组合框选中用户 ");
            comboBox.select();
            testBox.setText();
        }

    }

}
