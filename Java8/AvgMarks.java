package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AvgMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i =1 ; i<= 5 ; i++) {
			int c = sc.nextInt();
			list.add(c);
			
		}
		for(int d : list) {
		
		}
		double avg =list.stream().collect(Collectors.averagingDouble(e ->e));
		System.out.println("Avg marks is:-");
		System.out.println(avg);
	}
}


