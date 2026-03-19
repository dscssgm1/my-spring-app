package com.dong.base;

import org.springframework.stereotype.Component;

@Component
public class Login{
	//数据库
	
	@Log(operate_name = "Log in")
	public void login(String email, String password){
		System.out.println("log in~");
	}
	
	
	public String get_user_name(String email, String password){
		System.out.println("user name is~");
		return "Dawn";
	}
}