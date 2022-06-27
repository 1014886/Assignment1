package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenPriceQ7 {

	public static void main(String[] args) {
	
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	list.add(67);
	list.add(78);
	list.add(98);
	list.add(45);
	list.add(76);
	
	List<Integer> even=list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
	System.out.println("The even price from the list :" +even);
	

	}

}
