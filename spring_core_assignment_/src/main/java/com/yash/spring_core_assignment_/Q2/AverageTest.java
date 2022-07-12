package com.yash.spring_core_assignment_.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Average obja=(Average) objAC.getBean("que2");
		
		obja.avgNum();

	}

}
