package creation.build;

public class ActorController {
	public static Actor construct(ActorBuilder ab) {
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairStyle();
		actor = ab.createActor();
		return actor;
	}
}
