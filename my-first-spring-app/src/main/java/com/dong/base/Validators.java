package com.dong.base;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.List;

@Aspect
@Component
@Order(2)
public class Validators {
    @Autowired
    List<Validator> validators;
	
	@Before("execution(public * com.dong.base.Signup.signup(..)) && args(email, password, name)")
    public void sign_up_validate(String email, String password, String name) {
		for (Validator validator : this.validators) {
			validator.validate(email, password, name);
		}
    }
	
	@Before("execution(public * com.dong.base.Login.login(..)) && args(email, password)")
	public void log_in_validate(String email, String password) {
		String name = new String("Dawn");
		this.sign_up_validate(email, password, name);
    }
}