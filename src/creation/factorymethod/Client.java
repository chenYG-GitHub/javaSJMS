package creation.factorymethod;

import basic.XMLUtil;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = (Factory)XMLUtil.getBean("FactoryMethod");
		Logger logger = factory.createLogger();
		logger.writeLog();
	}
}
