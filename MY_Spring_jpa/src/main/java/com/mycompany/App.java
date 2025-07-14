package com.mycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.Service.StudentService;
import com.mycompany.Students.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
   ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml"); 	
    	
    StudentService studentService=context.getBean(StudentService.class);	
    	
    Student student=new Student();	
    
    student.setRoll(13);
    student.setName("Sahil Mansuri");
    student.setPercent(96.7);	
    	
    Integer i=studentService.insert(student);
      
    
        System.out.println( "Inserted row =>" +i );
    
       context.close();
      
    }
}
