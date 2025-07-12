package com.mycompany;

import java.util.Iterator;
import java.util.List;

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
  	 
  	   String query="select * from Student";
  	  
  	   List<Student> list=jdbcTemplate.query(query, new RowMapperImpl());
  	   
  	  Iterator<Student> i=list.iterator();
  	   
  	  while(i.hasNext())
  	  {
  		  
  		  
  		  Student student=i.next();
  		  
  		  System.out.println(student.getRoll()+"<=>"+student.getName()+"<=>"+student.getPercent());    	 
  	  
  	  }
  	   
  	   context.close();
  	   
    }
}
