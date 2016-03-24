package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stormpath.service.PasswordRuleMgr;
import com.stormpath.service.PasswordValidator;
import com.stormpath.service.ServiceProvider;

public class HelloWorld {
	
	/* Get actual class name to be printed on */
	static Logger log= LogManager.getLogger( HelloWorld.class.getName());
	
    public static void main(String[] args) {
    	
    	log.entry();
    	
//		LocalTime currentTime = new LocalTime();
//		System.out.println("The current local time is: " + currentTime);
//		Greeter greeter = new Greeter();
//		System.out.println(greeter.sayHello());
		
//		log.debug("This is test message for log4j debug logging");
//	    log.info("This is test message for log4j info logging");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	ApplicationContext context 
    	= new ClassPathXmlApplicationContext("application-context.xml");
	
    	ServiceProvider.setContext(context, "");
    	ServiceProvider.setContext(null, "");
		PasswordValidator validator = ServiceProvider.getPasswordValidator();
		PasswordRuleMgr mgr = ServiceProvider.getRuleMgr();
		//mgr.addRule("length has to be between 3 and 5", ".{3,5}");
		//mgr.addRule("length has to be between 3 and 5", "custom");
		//mgr.removeRule(".{5,12}");
		//mgr.removeAllRule();
		System.out.println(validator.validate(mgr, "adsffasf"));	
		System.out.println(mgr.getRuleMap());	
    	
	}
}
