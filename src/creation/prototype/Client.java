package creation.prototype;

import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeeklyLog log1,log2;
		log1 = new WeeklyLog();
		Attachment attachment = new Attachment();
		log1.setAttachment(attachment);
		log2 = log1.clone();
		System.out.println("�ܱ��Ƿ���ͬ��" + (log1 == log2));
		System.out.println("�����Ƿ���ͬ��" + (log1.getAttachment() == log2.getAttachment()));
	
		WeeklyLog2 log21,log22;
		log21 = new WeeklyLog2();
		Attachment2 attachment2 = new Attachment2();
		log21.setAttachment(attachment2);
		try {
			log22 = log21.deepClone();
			System.out.println("�ܱ�2�Ƿ���ͬ��" + (log21 == log22));
			System.out.println("����2�Ƿ���ͬ��" + (log21.getAttachment() == log22.getAttachment()));
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("��¡ʧ��");
			e.printStackTrace();
		}
		
	}

}
