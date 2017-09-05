package com.training;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }

	
	   
	   public Student getStudent(Integer id) {
		   Student student=null;
		   try{
		      String SQL = "select * from xbbnhhc_studentMaster where ID = ?";
		       student = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
		      return student;
		   }



	public List getAllStudent() {
		List studentList = null;
		 String SQL = "select * from xbbnhhc_studentMaster";
		 studentList= jdbcTemplateObject.query(SQL, new Object[]{}, new StudentMapper());
	      return studentList;
		}



	public void deleteStudent(Integer id) {
		String sql= "delete from xbbnhhc_studentMaster where ID = "+id;
		jdbcTemplateObject.update(sql);
	}



	public void updateStudentDetails( Student student,Integer id) {
		String sql="update xbbnhhc_studentMaster set age=" +student.getAge()+" where id="+id;
		 System.out.println("sql "+sql);	
		 jdbcTemplateObject.update(sql);
	
	}



	public void createStudent(Student student) {
		
		String sql="insert into xbbnhhc_studentmaster values("+student.getId()+",'"+student.getName()+"',"+student.getAge()+")";
		 jdbcTemplateObject.update(sql);
	}



	
}
