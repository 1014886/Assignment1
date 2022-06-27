package com.yash;

import java.util.ArrayList;
import java.util.List;

public class ParllelStreamQ11 {

	public static void main(String[] args) {
	   List<Integer> no=new ArrayList<Integer>();
	   
	   no.add(409);
	   no.add(123);
	   no.add(56);
	   no.add(235);
	   no.add(345);
	   no.add(107);
	   
	   System.out.println("Find any parallel stram");
	   no.stream().parallel().filter(n -> n >55).findAny().ifPresent(System.out::println);

	}

}
