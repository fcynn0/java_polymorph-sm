package java_BTK_Polymorphısm;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
//		for (BaseLogger baseLogger : loggers) {
//			baseLogger.log("log mesajı");
//		}
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
	

	}

}
