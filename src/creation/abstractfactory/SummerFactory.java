package creation.abstractfactory;

public class SummerFactory implements Factory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public ComboBox createComboBox() {
		return new SummerComboBox();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

}
