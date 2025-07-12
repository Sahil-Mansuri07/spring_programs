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
    	
    String query="insert into Student(roll,name,percent) values(?,?,?)";
    	
    Integer i=jdbcTemplate.update(query,13,"Sahil Mansuri",96.7);        
    
    System.out.println("Number of row inserted => "+i);
    
    
        context.close();
    
    }
}
