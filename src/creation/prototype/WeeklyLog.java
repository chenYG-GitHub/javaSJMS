package creation.prototype;

public class WeeklyLog implements Cloneable {
	private Attachment attachment;
	private String name;
	private String date;
	private String content;
	public Attachment getAttachment() {
		return attachment;
	}
	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public WeeklyLog clone(){
		
		try {
			return (WeeklyLog) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("��֧�ָ���");
			return null;
		}
		
	}
}
