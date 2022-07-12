package com.yash.spring_core_assignment_.Q8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

public class ItemList {
	List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ItemList [name=" + name + "]";
	}
	
@PostConstruct
public void itemName() {
	System.out.println("Item List:-"+name);
	List<String> sort=name.stream().sorted().collect(Collectors.toList());
	System.out.println("Item name is assending order:");
	System.out.println(sort);
	
	
	List<String> rev = name.stream()
	        .sorted(Collections.reverseOrder())
	        .collect(Collectors.toList());
	System.out.println("Item name is descending order:");
	System.out.println(rev);
	
	List<String> removedup = name.stream()
            .distinct()
            .collect(Collectors.toList());
	System.out.println("Item name without duplicate:");
	System.out.println(removedup);


	
	
}

}
