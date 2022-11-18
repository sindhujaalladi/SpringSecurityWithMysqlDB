package com.springsecuritywithmysqldb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.springsecuritywithmysqldb.repository.StudentRepository;
import com.springsecuritywithmysqldb.Entity.Student;
import com.springsecuritywithmysqldb.pojo.StudentDTO;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordencoder;

	@Override
	public void createStudentDetailsData(StudentDTO studentDTO) {
		Student stdobj = new Student();
		stdobj.setEmail(studentDTO.getEmail());
		stdobj.setIsActive(studentDTO.getIsActive());
		String pwd = studentDTO.getPassword();
		stdobj.setPassword(passwordencoder.encode(pwd));
		stdobj.setUsername(studentDTO.getUsername());
		stdobj.setUserid(studentDTO.getUserid());
		studentRepository.save(stdobj);
	}


}
