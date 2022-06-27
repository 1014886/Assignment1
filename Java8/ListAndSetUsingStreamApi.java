package com.yash;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListAndSetUsingStreamApi {
	
	int id;
	String name;
	int salary;
	String address;
	
	public ListAndSetUsingStreamApi(int id, String name, int salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		List<ListAndSetUsingStreamApi> emplist = new ArrayList<ListAndSetUsingStreamApi>() ;
		emplist.add(new ListAndSetUsingStreamApi(1, "sandip kale", 18000, "warje pune"));
		emplist.add(new ListAndSetUsingStreamApi(2, "raj shinde", 21000, "hinjewadi pune"));
		emplist.add(new ListAndSetUsingStreamApi(3, "swapnil waje", 18000, "wakad pune"));
		emplist.add(new ListAndSetUsingStreamApi(4, "mahesh kamble", 25000, "bhosari pune"));
		emplist.add(new ListAndSetUsingStreamApi(5, "kailas kate", 20000, "pathardi"));
		emplist.add(new ListAndSetUsingStreamApi(6, "omkar bhosale", 30000, "shrigonda"));
		emplist.add(new ListAndSetUsingStreamApi(7, "ajinkya nalage", 27000, "kesnand"));
		emplist.add(new ListAndSetUsingStreamApi(8, "nitin wagh", 29000, "lonar"));
		emplist.add(new ListAndSetUsingStreamApi(9, "mangesh dange", 26000, "shigonda"));



		
		Map<Object, Object> empMap = emplist.stream().collect(Collectors.toMap(e -> e.getId(),
				e -> e.getName()));
		System.out.println(empMap);



	}
	
	

}
