package structural.adapter;

import basic.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarController carController = (CarController)XMLUtil.getBean("Adapter");
		carController.move();
		carController.phonate();
		carController.twinkle();
	}

}
