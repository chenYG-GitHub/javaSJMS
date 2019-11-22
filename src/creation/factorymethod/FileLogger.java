package creation.factorymethod;

public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("将日志写入文件中");
	}

}
