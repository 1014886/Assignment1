package com.yash.spring_core_assignment_.Q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VowelTest {

	public static void main(String[] args) {
	ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
	Vowel objv=(Vowel) objAC.getBean("que6");
	System.out.println("The given string of array is:-");
	objv.show();
	System.out.println("The string having no vowel is:-");
	objv.result();
	
	

	}

}
