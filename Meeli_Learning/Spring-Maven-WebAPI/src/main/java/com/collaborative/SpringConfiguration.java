package com.collaborative;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.collaborative"})

public class SpringConfiguration {
	
	@Bean
	public MyService myService() {
		return new MyService();
	}
}
