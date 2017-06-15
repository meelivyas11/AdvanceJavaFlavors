package com.collab.Util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.collab.DAO.UserDAO;

@Configuration
@ComponentScan({"com.collab"})
public class SpringConfig {
	
	@Bean
	public UserDAO userDAO() {
		return new UserDAO();
	}
}