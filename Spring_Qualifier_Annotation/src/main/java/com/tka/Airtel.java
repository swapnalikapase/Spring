package com.tka;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{

	public String calling() {
		
		return "U R Calling From Airtel";
	}

}
