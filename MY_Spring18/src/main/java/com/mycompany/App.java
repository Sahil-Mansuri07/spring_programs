package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); 	
       	
   JdbcTemplate jdbcTemplate=context.getBean("my_jdbc",JdbcTemplate.class);
      	    
   System.out.println( jdbcTemplate );
 
   String query="delete from Student where roll=?";
    
   Integer i=jdbcTemplate.update(query,13);
    	
   System.out.println( "Number of row deleted => " +i );
   
   context.close();
	
   
    }
}
