package com.dong.base;

import org.springframework.stereotype.Component;

@Component
public class PasswordValidate implements Validator{
	public void validate(String email, String password, String name) {
        if (!password.matches("^.{6,20}$")) {
            throw new IllegalArgumentException("invalid password");
        }
    }
}