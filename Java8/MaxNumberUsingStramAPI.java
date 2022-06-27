package com.yash;

import java.util.Arrays;
import java.util.List;


public class MaxNumberUsingStramAPI {

	public static void main(String[] args) {
	
		 // Creating a list of integers
		List<Integer> list=Arrays.asList(2,4,5,4,5,9,7);
		System.out.println("The maximum value is:");
		
	    Integer var = list.stream().max(Integer::compare).get();
	    System.out.println(var);

	}

}
