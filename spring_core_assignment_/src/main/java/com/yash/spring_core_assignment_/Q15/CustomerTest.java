package com.yash.spring_core_assignment_.Q15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext ctxobj= new ClassPathXmlApplicationContext("com/yash/spring_core_assignment_/Q15/myFile.xml");
		Customer cust1=(Customer) ctxobj.getBean("custbean");
		System.out.println(cust1.toString());
		
	}
	}



