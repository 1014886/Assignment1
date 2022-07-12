package com.yash.spring_core_assignment_.Q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext objAC=new ClassPathXmlApplicationContext("com/yash/spring_core_assignment_/Q7/myFile.xml");
		MergeArray objm=(MergeArray) objAC.getBean("que7");
		objm.merge();
	
		
	}

}
