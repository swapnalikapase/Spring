package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.config;
import com.entity.*;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		/*
		 * College c = context.getBean(College.class);//we can give id with seperate
		 * coma College c1 = context.getBean(College.class);
		 * System.out.println(c.hashCode());
		 */
		//System.out.println(c1.hashCode());
		
		/*
		 * if(c==c1) { System.out.println("same"); }else {
		 * System.out.println("Different"); }
		 */
			
		Student s = context.getBean(Student.class);
		System.out.println(s);
		
	}

}
