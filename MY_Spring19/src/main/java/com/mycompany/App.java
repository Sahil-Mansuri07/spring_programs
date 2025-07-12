package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
    	 
    	   String query="select * from Student where roll=?";
    	    
    	   Student student=jdbcTemplate.queryForObject(query,  new RowMapperImpl(), 12);
    	   
    	   System.out.println(student.getRoll()+"=>"+student.getName()+"=>"+student.getPercent());
    	   
    	  
    	   context.close();
   
    }
}
