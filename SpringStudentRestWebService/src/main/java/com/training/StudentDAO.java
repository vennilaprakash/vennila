package com.training;

import java.util.List;

public interface StudentDAO {

	   public Student getStudent(Integer id);
	   public List getAllStudent();
	   public void updateStudentDetails(Student student,Integer id);
	   public void deleteStudent(Integer id);
	   public void createStudent(Student student);
	   
}
