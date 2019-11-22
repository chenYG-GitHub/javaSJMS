package creation.abstractfactory;

import basic.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = (Factory)XMLUtil.getBean("AbstractFactory");
		Button button = factory.createButton();
		ComboBox cBox = factory.createComboBox();
		TextField tField = factory.createTextField();
		button.display();
		cBox.display();
		tField.display();
	}

}
