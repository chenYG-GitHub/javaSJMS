package structural.bridge;

import basic.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = (Image)XMLUtil.getBean("BridgeImage");
		ImageImpl imp = (ImageImpl)XMLUtil.getBean("BridgeImp");
		image.setImp(imp);
		image.parseFile("Ð¡ÁúÅ®");
	}

}
