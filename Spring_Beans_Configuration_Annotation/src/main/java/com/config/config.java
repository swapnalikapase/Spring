package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.entity.College;

//@ComponentScan("com.entity")
@Configuration
public class config {
	@Bean()//to create bean
	//@Scope(prototype) de sakte hai
	public College clgobj(){
		return new College();
	}//Annonomus object creation
	

}
