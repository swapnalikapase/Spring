package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.entities.*;
public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s = context.getBean(Student.class);
		//College c=context.getBean(College.class);
		System.out.println(s);
		//System.out.println(c);
	}

}
