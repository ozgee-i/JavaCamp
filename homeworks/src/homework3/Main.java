package homework3;

import homework3.polymorphismDemo.BaseLogger;
import homework3.polymorphismDemo.ConsoleLogger;
import homework3.polymorphismDemo.CustomerManager;
import homework3.polymorphismDemo.DatabaseLogger;
import homework3.polymorphismDemo.EmailLogger;
import homework3.polymorphismDemo.FileLogger;

public class Main {

	public static void main(String[] args) {
	/*	BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };

		for (BaseLogger logger : loggers) {
			logger.Log("Log mesajı");    */
		
		
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		customerManager.Add();
		}

	}


