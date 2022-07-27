package com.spring_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_jdbc.dao.StudentDao;
import com.spring_jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao" ,StudentDao.class);
    
    	//Insert record
    	//int i=studentDao.saveStudent(new Student(3, "Neha", "MBA", "Rohtak"));
    	
    	
    	//update recored
    	//int i=studentDao.updateStudent(new Student(2, "Lalan top", "News", "Delhi"));

    	//delete record
    	
    	//int i=studentDao.deleteStudent(2);
    	//System.out.println("Student is deleted: "+i);
    	
    	//get single record
    	//Student s=studentDao.getStudent(1);
    	List<Student> l=studentDao.getAllStudent();
    	for(Student s:l)
    	System.out.println(s);
    	
    	
    	
    }
}
