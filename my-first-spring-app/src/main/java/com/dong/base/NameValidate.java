package com.dong.base;

import org.springframework.stereotype.Component;

@Component
public class NameValidate implements Validator{
	public boolean validate(String email, String password, String name) {
        if (name == null || name.isBlank() || name.length() > 20) {
            System.out.println("User name wrong!");
			return false;
        }
		return true;
    }
}