package creation.build;

import basic.XMLUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actor actor = ActorController.construct((ActorBuilder)XMLUtil.getBean("Builder"));
		System.out.println(actor.getType() + "外观：");
		System.out.println("性别：" + actor.getSex());
		System.out.println("面容：" + actor.getFace());
		System.out.println("服装：" + actor.getCostume());
		System.out.println("发型：" + actor.getHairStyle());
	}

}
