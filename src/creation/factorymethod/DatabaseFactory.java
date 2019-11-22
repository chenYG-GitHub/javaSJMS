package creation.factorymethod;

public class DatabaseFactory implements Factory {

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new DatabaseLogger();
	}

}
