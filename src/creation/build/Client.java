package creation.build;

import basic.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor actor = ActorController.construct((ActorBuilder)XMLUtil.getBean("Builder"));
		System.out.println(actor.getType() + "��ۣ�");
		System.out.println("�Ա�" + actor.getSex());
		System.out.println("���ݣ�" + actor.getFace());
		System.out.println("��װ��" + actor.getCostume());
		System.out.println("���ͣ�" + actor.getHairStyle());
	}

}
