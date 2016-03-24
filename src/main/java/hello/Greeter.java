package hello;

import com.stormpath.service.PasswordValidator;

public class Greeter extends PasswordValidator {
	public String sayHello() {
		return "Hello World!";
	}
	
	public boolean validate(String password) {
		System.out.println("Greeter testsss");
		return super.validate(password);
	}
}
