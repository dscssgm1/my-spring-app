package com.dong.base;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;


@Aspect
@Component
@Order(1)
public class WriteLog{
	@Around("@annotation(log) && args(email, password, ..)")
	public Object writelog(ProceedingJoinPoint joinPoint, Log log, String email, String password) throws Throwable{
		String operate_name = log.operate_name();
		boolean flag = true;
		Throwable wrong = new Throwable("no throw");
		try{
			return joinPoint.proceed();
		} catch(Throwable e) {
			flag = false;
			wrong = e;
			throw e;
		} finally {
			if(flag){
				System.out.println("[Log]"+operate_name+":\n\tEmail:"+email+"\n\tPassword:"+password+"\n\t\tSuccess!");
			}else{
				System.out.println("[Log]"+operate_name+":\n\tEmail:"+email+"\n\tPassword:"+password+"\n\t\tFailed:"+wrong.getMessage());
			}
		}
	}
}