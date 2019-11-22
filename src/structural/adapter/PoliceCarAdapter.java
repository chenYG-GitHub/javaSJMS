package structural.adapter;

public class PoliceCarAdapter extends CarController{

	private PoliceLamp lamp;
	private PoliceSound sound;
	
	public PoliceCarAdapter() {
		super();
		this.lamp = new PoliceLamp();
		this.sound = new PoliceSound();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void phonate() {
		// TODO Auto-generated method stub
		sound.alarmSound();
	}

	@Override
	public void twinkle() {
		// TODO Auto-generated method stub
		lamp.alarmLamp();
	}

}
