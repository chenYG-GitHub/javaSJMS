package creation.prototype;

import java.io.Serializable;

public class Attachment2 implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void download() {
		System.out.println("下载附件，文件名为：" + this.name);
	}
}
