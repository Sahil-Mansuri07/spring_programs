package com.mycompany.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.Students.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
