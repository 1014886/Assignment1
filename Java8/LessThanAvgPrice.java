package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LessThanAvgPrice {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(24);
		al.add(45);
		al.add(56);
		al.add(67);
		al.add(69);
		
		Double avgmarks=al.stream().mapToDouble(s -> s.intValue()).average().getAsDouble();
        System.out.println("Average of marks :" +avgmarks);
        
        List<Integer> lta=al.stream().filter(i -> i<avgmarks).collect(Collectors.toList());
        System.out.println("List of numbers less than average :" +lta);
	}

}
