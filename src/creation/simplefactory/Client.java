package creation.simplefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = Factory.getProduct("A");
		if(product != null){
			product.methodDiff();
		}
	}

}
