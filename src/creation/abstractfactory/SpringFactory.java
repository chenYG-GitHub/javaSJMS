package creation.abstractfactory;

public class SpringFactory implements Factory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

}
