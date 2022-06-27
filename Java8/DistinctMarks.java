package com.yash;

import java.security.DomainCombiner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMarks {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(78,67,90,78,67,89,90,65);
		
	    List<Integer> dm=list.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println("Distinct marks of given list:-");
	    System.out.println(dm);
	}
		
	}

		
	
	      
			
		
	
	


