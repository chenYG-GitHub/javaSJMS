package structural.bridge;

public class BMPImage extends Image {

	@Override
	public void parseFile(String name) {
		// TODO Auto-generated method stub
		Matrix m = new Matrix();
		super.imp.doPaint(m);
		System.out.println(name + ",��ʽΪBMP");
	}

}
