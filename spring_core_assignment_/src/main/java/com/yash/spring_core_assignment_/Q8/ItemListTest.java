package com.yash.spring_core_assignment_.Q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemListTest {
	public static void main(String[] args) {
  ApplicationContext objAC=new ClassPathXmlApplicationContext("applicationContext.xml");
  ItemList obji=(ItemList) objAC.getBean("que8");
  obji.itemName();

	}

}
