package com.dong;

import com.dong.base.Login;
import com.dong.base.Signup;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
 
 @Configuration
 @ComponentScan("com.dong")
 @EnableAspectJAutoProxy
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    
		Signup sign = context.getBean(Signup.class);
		Login log = context.getBean(Login.class);
		
		String email = new String("@");
		String password = new String("@");
		String name = new String("Dawn");
		
		try{
			sign.signup(email,password,name);
		} catch(IllegalArgumentException e){
			System.out.println("注册中捕获到异常："+e.getMessage());
		}
		
		try{
			log.login(email,password);
		} catch(IllegalArgumentException e){
			System.out.println("登陆中捕获到异常："+e.getMessage());
		}
	}
}
