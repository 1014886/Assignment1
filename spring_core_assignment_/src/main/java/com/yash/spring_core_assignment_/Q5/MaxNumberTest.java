package com.yash.spring_core_assignment_.Q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaxNumberTest {
	public static void main(String[] args) {
		
		ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
		MaxNumber objm=(MaxNumber) objAC.getBean("que5");
		objm.MaxNumber();
	}

}
