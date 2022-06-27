package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingStreamApi {
	public static void main(String[] args) {

		String name;

		List<String> al=new ArrayList<String>();
		al.add("raj");
		al.add("sandip");
		al.add("ankit");
		al.add("prakash");
		al.add("sandip");
		al.add("raj");



		List<String> sort=al.stream().sorted().collect(Collectors.toList());
		List<String> uni=sort.stream().distinct().collect(Collectors.toList());
		System.out.println("The Sorted employee Names are : " +sort);
		System.out.println("The unique employee Name are : " +uni);
		}
}
