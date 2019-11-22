package structural.bridge;

public abstract class Image {
	protected ImageImpl imp;

	public void setImp(ImageImpl imp) {
		this.imp = imp;
	}

	public abstract void parseFile(String name);
	
	
}
