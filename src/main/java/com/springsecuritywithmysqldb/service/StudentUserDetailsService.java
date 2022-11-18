package com.springsecuritywithmysqldb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecuritywithmysqldb.Entity.Student;
import com.springsecuritywithmysqldb.repository.StudentRepository;

@Service
public class StudentUserDetailsService implements UserDetailsService{
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Student> stuobj = studentRepository.findByUsername(username);
		stuobj.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		return stuobj.map(StudentUserDetail::new).get();
		
		/*StudentUserDetail userdetails = null;
		if(stuobj != null) {
			
			userdetails.setStudent(stuobj);
		} else {
			throw new UsernameNotFoundException("user not exits with the name" + username);

		}
		
		return userdetails;
	}*/
	

}}
 	