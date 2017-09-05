package com.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentService {

	@Autowired
	StudentJDBCTemplate studentDAOImpl;

   	

    @RequestMapping(value="student/{id}",method = RequestMethod.GET)
    public @ResponseBody Student getStudent(@PathVariable int id){
    	Student s=null;
          s= studentDAOImpl.getStudent(id);
         
		 return s;
    }
   
    
    @RequestMapping(value="/student",method = RequestMethod.GET) 
	public @ResponseBody List<Student> getAllBookDetails(ModelMap model){
		List bookList = null;
		bookList = (List) studentDAOImpl.getAllStudent();
		return bookList ;
		
	}
    @RequestMapping(value="student/{id}",method = RequestMethod.DELETE)
    public @ResponseBody Student deleteStudent(@PathVariable("id") int id){
    Student s=studentDAOImpl.getStudent(id);
	studentDAOImpl.deleteStudent(id);
    return s;	
      
    }
    @RequestMapping(value="/student/{id}",method = RequestMethod.PUT)  
	public @ResponseBody Student updateStudentDetails(@RequestBody Student student,@PathVariable int id){
		studentDAOImpl.updateStudentDetails(student,id);
		Student s=studentDAOImpl.getStudent(id);
		return s;
		
	}
    
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public @ResponseBody Student createStudent(@RequestBody Student student){
		
		
		studentDAOImpl.createStudent(student);
		
		return  student;
		
	}
	
}
