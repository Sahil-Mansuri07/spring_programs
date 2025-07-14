package com.mycompany.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.mycompany.service.PaymentServiceImpl.makePayment())")
	public void beforeAuth()
	{

		System.out.println("Authentication starts");
		
	}
	
	
	@After("execution(* com.mycompany.service.PaymentServiceImpl.makePayment())")
	public void afterAuth()
	{

		System.out.println("Reciept of payment");
		
	}
	
	
}
