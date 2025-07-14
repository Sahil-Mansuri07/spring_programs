package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

   ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
   PaymentService paymentService=context.getBean("paymentService",PaymentService.class);
   
   paymentService.makePayment();
   
    context.close();	
    	
    }
}
