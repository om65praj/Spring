package com.bridgeit.AutowireNo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Country country = context.getBean(Country.class);
		
		System.out.println("Country details : "+country);
	}
}
