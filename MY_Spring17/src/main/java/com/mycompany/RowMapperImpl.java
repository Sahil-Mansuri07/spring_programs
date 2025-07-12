package com.mycompany;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student>  {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
    Student student=new Student();
		
	student.setRoll(rs.getInt(1));
	student.setName(rs.getString(2));
	student.setPercent(rs.getDouble(3));
	
	return student;
	
	}
}
