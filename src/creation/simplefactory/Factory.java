package creation.simplefactory;

public class Factory {
	public static Product getProduct(String type) {
		Product result = null;
		if(!Factory.isProduct(type)){
			System.out.println("指定产品名称有误！");
		}else{
			switch (type) {
				case "A":
					result = new ProductA();
					break;
				case "B":
					result = new ProductB();
					break;
				default:
					break;
			}
		}
		return result;
	}
	
	private static boolean isProduct(String type) {
		switch (type) {
			case "A":
				return true;
			case "B":
				return true;
			default:
				return false;
		}
	}
}
