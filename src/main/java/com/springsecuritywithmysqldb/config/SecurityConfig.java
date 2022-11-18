package com.springsecuritywithmysqldb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.springsecuritywithmysqldb.service.StudentUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	

	@Autowired
	private StudentUserDetailsService userDetailService;
	
	@Override 
	protected void configure (AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
	}

	@Override 
	protected void configure (HttpSecurity http) throws Exception {
	  http.csrf().disable();
	 // http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		//http.authorizeRequests().antMatchers("/Student/**").authenticated().anyRequest().permitAll().and().formLogin();

http
.authorizeRequests()
.antMatchers("/Student/**").permitAll()
.anyRequest()
.authenticated()
.and()
.formLogin();
	 }

	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
}
