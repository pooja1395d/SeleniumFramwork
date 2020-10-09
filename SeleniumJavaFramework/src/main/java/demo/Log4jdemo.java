package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {

	static Logger logger1 = LogManager.getLogger(Log4jdemo.class);
	public static void main(String[] args) {
		System.out.println("hello world");
		
		logger1.trace("this is trace message");
		logger1.info("this is an information message");
		logger1.error("this is an error message");
		logger1.warn("this is waring message");
		logger1.fatal("this is fatal message");
		System.out.println("completed");

}
}