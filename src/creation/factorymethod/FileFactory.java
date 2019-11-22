package creation.factorymethod;

public class FileFactory implements Factory {

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new FileLogger();
	}

}
