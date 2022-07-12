package com.yash.spring_core_assignment_.Q5;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

public class MaxNumber {
	
	List<Integer> num;

	public List<Integer> getNum() {
		return num;
	}

	public void setNum(List<Integer> num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "MaxNumber [num=" + num + "]";
	}
	@PostConstruct
	public void MaxNumber() {
		//double max =num.stream().collect(Collectors.maxBy()
	    Integer max = num.stream().max(Integer::compare).get();
	    System.out.println("Maximum number is: "+max);


	}

}
