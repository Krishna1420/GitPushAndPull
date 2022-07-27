package com.spring_jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring_jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int saveStudent(Student s) {
		String qry = "insert into Student(id,name,cources,address) values(?,?,?,?)";
		int i = this.jdbcTemplate.update(qry, s.getId(), s.getName(), s.getCources(), s.getAddress());
		return i;
	}

	public int updateStudent(Student s) {
		String qry = "update Student set name=?,cources=?,address=? where id=?";
		int i = this.jdbcTemplate.update(qry, s.getName(), s.getCources(), s.getAddress(), s.getId());
		return i;
	}

	public int deleteStudent(int id) {

		String qry = "delete from Student where id=?";
		int i = this.jdbcTemplate.update(qry, id);
		return i;
	}
	RowMapper<Student> rowMapper=new RowMapperImpl();

	public Student getStudent(int id) {
		String qry="select * from Student where id=?";
		Student s=this.jdbcTemplate.queryForObject(qry, rowMapper, id);
		return s;
	}
	
	public List<Student> getAllStudent() {
		
		String qry="select * from student";
		List<Student> list=this.jdbcTemplate.query(qry, rowMapper);
		
		
		return list;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

}
