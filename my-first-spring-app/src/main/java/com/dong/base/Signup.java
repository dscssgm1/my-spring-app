package com.dong.base;

import org.springframework.stereotype.Component;

@Component
public class Signup{
	//数据库
	
	public boolean is_email_exist(String email){
		System.out.println("is email exist?");
		return true;
	}
	
	@Log(operate_name = "Sign up")
	public void signup(String email, String password, String name){
		if(this.is_email_exist(email)){
			System.out.println("sign up~");
		}
	}
}