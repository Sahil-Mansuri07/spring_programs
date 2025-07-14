package com.mycompany.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.DAO.StudentRepository;
import com.mycompany.Students.Student;

@Service
public class StudentService {

	
	@Autowired
	StudentRepository studentRepository;
	
	public Integer insert(Student student)
	{
		
	Student savedStudent=studentRepository.save(student);
	
	return savedStudent.getRoll();
		
	}
	
}
