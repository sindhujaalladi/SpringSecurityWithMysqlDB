package com.springsecuritywithmysqldb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecuritywithmysqldb.pojo.StudentDTO;
import com.springsecuritywithmysqldb.service.StudentService;

@RestController
@RequestMapping("/Student/auth/v1")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/createStudDetails")
	public String createStudentDetailsData(@RequestBody StudentDTO studentDTO) {
		this.studentService.createStudentDetailsData(studentDTO);
		return "Use data successfully added in database";
		
	}

}
