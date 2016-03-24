package hellotest;

import static org.junit.Assert.*;
import hello.Greeter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GreeterNullTest {


	Greeter greeter = new Greeter();
	
	/* Get actual class name to be printed on */
	static Logger log= LogManager.getLogger( GreeterTest.class.getName());
	
	@BeforeClass
	public static void init() {
		log.info("Greeter Null Test.");
	}
	
	@Test
	public void testSayHello () {
		
		log.info("GreeterTest::greeter.sayHello: " + greeter.sayHello());
		assertNotNull(greeter.sayHello());
		
	}
	
}
