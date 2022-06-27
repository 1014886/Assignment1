package com.yash;

import java.util.ArrayList;
import java.util.List;


public class MaximumLengthOfString {
	
	public static void main(String[] args) { 
		
		
		String[] str = {"mahesh", "kiran", "vaibhav", "renuka", "nitin","swaranjali"};
		
		List<Integer> stringcount= new ArrayList<Integer>();
		
		for(String s:str) {
			int count=0;
			char[]arr=s.toCharArray();
			for(char ch:arr) {
				count++;
				
			}
			stringcount.add(count);
			
			
		}
		
		//System.out.println(stringcount);
		Integer max=stringcount.stream().max((s1,s2)->s1.intValue()>s2.intValue()?1:-1).get();
		System.out.println("Maximum length of given string :"+max);
	}
}

	


