package com.spring_jdbc.dao;

import java.util.List;

import com.spring_jdbc.entities.Student;

public interface StudentDao {

	public int saveStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
	
	
}
