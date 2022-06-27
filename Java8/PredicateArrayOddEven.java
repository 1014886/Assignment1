package com.yash;

import java.util.function.Predicate;

public class PredicateArrayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {45,36,45,67,78,86,98};
		int even=0,odd=0;
		
		Predicate<Integer> checkeven =num->num % 2 == 0;
		
		for(int i=0;i<arr.length;i++) {
			if(checkeven.test(arr[i])) {
				even++;
			}
			else
				odd++;
			
			
		}
		System.out.println("Total even numbers in array-" +even);
		System.out.println("Total odd numbers in array-" +odd);
		

	}

}
