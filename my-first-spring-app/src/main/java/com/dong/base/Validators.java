package com.dong.base;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import java.util.List;

@Component
@Scope("prototype")
public class Validators {
    @Autowired
    List<Validator> validators;
	
	private boolean judge = true;

    public void validate(String email, String password, String name) {
        for (Validator validator : this.validators) {
            if(!validator.validate(email, password, name)) judge = false;
        }
    }
	
	public void show(){
		System.out.println(this.judge);
	}
}