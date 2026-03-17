package com.dong.base;

import org.springframework.stereotype.Component;

@Component
public class MailValidate implements Validator{
	public boolean validate(String email, String password, String name) {
        if (!email.matches("^[a-z0-9]+\\@[a-z0-9]+\\.[a-z]{2,10}$")) {
            System.out.println("email address wrong!");
			return false;
        }
		return true;
    }
}