package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqeNameOfEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		 List<String> al=new ArrayList<String>();
		 al.add("sandip");
		 al.add("mayur");
		 al.add("anil");
		 al.add("swapnil");
		 al.add("mahesh");
		 al.add("sandip");
		 
		 List<String> so=al.stream().sorted().collect(Collectors.toList());
		 List<String> uni=so.stream().distinct().collect(Collectors.toList());
		 System.out.println(so);
		 System.out.println(uni);

	}
	

}
