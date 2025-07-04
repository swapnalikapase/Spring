package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.*;
import com.entity.Recharge;

public class main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Recharge r = context.getBean(Recharge.class);
		r.recharge();
	}

}
