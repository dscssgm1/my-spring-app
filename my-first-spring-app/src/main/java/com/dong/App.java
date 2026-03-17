package com.dong;

import com.dong.base.Validators;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
 
 @Configuration
 @ComponentScan("com.dong")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    
		Validators validators1 = context.getBean("validators", Validators.class);
		Validators validators2 = context.getBean("validators", Validators.class);
		validators2.validate("309@qq.com", "88888888", "Dawn");
		validators2.show();
		validators1.validate("@", "AAA", "@");
		validators1.show();
		validators2.show();
	}
}
