package com.dong.base;

import org.springframework.stereotype.Component;

@Component
public class PasswordValidate implements Validator{
	public boolean validate(String email, String password, String name) {
        if (!password.matches("^.{6,20}$")) {
            System.out.println("User password wrong!");
			return false;
        }
		return true;
    }
}