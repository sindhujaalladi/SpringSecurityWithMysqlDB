package com.springsecuritywithmysqldb.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO  implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int userid;
	private String username;
	private String password;
	private String email;
	private String isActive;

}
