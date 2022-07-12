package com.yash.spring_core_assignment_.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {
	public static void main(String[] args) {
		ApplicationContext ctxobj= new ClassPathXmlApplicationContext("com/yash/spring_core_assignment_/Q1/myFile.xml");
		Role role= (Role) ctxobj.getBean("rolebean");
		role.show();		
	}
	}