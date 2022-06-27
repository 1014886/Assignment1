package com.yash;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer>p=number->(number % 2 ==0);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter given number");
		
		int a=sc.nextInt();
		
		System.out.println(p.test(a));

	}

}
