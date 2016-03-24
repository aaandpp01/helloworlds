package hellotest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	/* Get actual class name to be printed on */
	static Logger log= LogManager.getLogger( TestRunner.class.getName());
	
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(GreeterTestSuites.class); 
		
		for (Failure failure : result.getFailures()) {
			
			log.info(failure.toString()); 
		
		}
		
		log.info(result.wasSuccessful()); }
	
}
