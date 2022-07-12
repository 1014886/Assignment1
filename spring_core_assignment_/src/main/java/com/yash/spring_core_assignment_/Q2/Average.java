package com.yash.spring_core_assignment_.Q2;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

public class Average {

List<Integer> num;

public List<Integer> getNum() {
	return num;
}

public void setNum(List<Integer> num) {
	this.num = num;
}

@Override
public String toString() {
	return "Average [num=" + num + "]";
}

@PostConstruct
public void avgNum() {
	double avg=num.stream().collect(Collectors.averagingDouble(e ->e));
	System.out.println("Average of Number: "+avg);
}

}
