package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AscepeContains {

	
	  @Before("execution(* com.entity.Recharge.recharge(..))") public void
	  beforeRecharge() {
	  System.out.println("U R pack is Expiring soon...! plz recharge..."); }
	 
	  @After("execution(* com.entity.Recharge.recharge(..))") public void
	  afterRecharge() { System.out.println("Enjoy Your Data Pack..."); }
	 
	@Around("execution(* com.entity.Recharge.recharge(..))")
	public void aroundMain(ProceedingJoinPoint p) {
	System.out.println("Enjoy Your Data Pack...");
	try {
		p.proceed();
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
}
	
}
