package creation.prototype;

public class Attachment {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void download() {
		System.out.println("���ظ������ļ���Ϊ��" + this.name);
	}
}
