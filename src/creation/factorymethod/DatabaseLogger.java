package creation.factorymethod;

public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("将日志写入数据库中");
	}

}
