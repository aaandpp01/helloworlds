package hellotest;

import static org.junit.Assert.*;
import hello.Greeter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GreeterTest {

	String expected;
	Greeter greeter = new Greeter();
	
	/* Get actual class name to be printed on */
	static Logger log= LogManager.getLogger( GreeterTest.class.getName());
	
	@Before
	public void init() {
		expected = "Hello World!";
	}
	
	@Test
	public void testSayHello () {
		
		log.info("GreeterTest::greeter.sayHello: " + greeter.sayHello());
		assertEquals(expected, greeter.sayHello());
		
	}
	
	@Test
	@Ignore
	public void testPending() {
		
	}
	
	
}
