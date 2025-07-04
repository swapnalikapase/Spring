package com.tka;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim{

	public String calling() {
		
		return " U R Calling From Jio";
	}

}
