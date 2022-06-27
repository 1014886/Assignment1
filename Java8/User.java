package com.yash;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	private String IName;
	private float price;
	private String Mdate;
	private String Edate;
	private String Catename;


	public String getIName() {
	return IName;
	}


	public void setIName(String iName) {
	IName = iName;
	}


	public float getPrice() {
	return price;
	}


	public void setPrice(float price) {
	this.price = price;
	}


	public String getMdate() {
	return Mdate;
	}


	public void setMdate(String i) {
	Mdate = i;
	}


	public String getEdate() {
	return Edate;
	}


	public void setEdate(String d) {
	Edate = d;
	}


	public String getCatename() {
	return Catename;
	}


	public void setCatename(String catename) {
	Catename = catename;
	}


	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Data to search detail");
	   String s1=sc.next();
	if(s1.equals("Laptop")||s1.equals("01/01/2022")||s1.equals("01/01/2050")||s1.equals("Dell")||s1.equals("50000")) {
	User id=new User();
	id.setIName("lapotp");
	id.setMdate("01/01/2022");
	id.setEdate("01/01/2050");
	id.setCatename("Dell");
	id.setPrice(50000);

	System.out.println("Item Name is: "+id.getIName());
	System.out.println("Item Manifacturing date is: "+id.getMdate());
	System.out.println("Item Expiry date is: "+id.getEdate());
	System.out.println("Item Category Name is: "+id.getCatename());
	System.out.println("Item Price is: "+id.getPrice());

	}else if(s1.equals("Mobile")||s1.equals("02/02/2022")||s1.equals("02/02/2050")||s1.equals("Vivo")||s1.equals("30000")) {
	User id1=new User();
	id1.setIName("Mobile");
	id1.setMdate("02/02/2022");
	id1.setEdate("02/02/2050");
	id1.setCatename("Vivo");
	id1.setPrice(30000);

	System.out.println("Item Name is: "+id1.getIName());
	System.out.println("Item Manifacturing date is: "+id1.getMdate());
	System.out.println("Item Expiry date is: "+id1.getEdate());
	System.out.println("Item Category Name is: "+id1.getCatename());
	System.out.println("Item Price is: "+id1.getPrice());
	}

	}
	
}
	

	

		
		
		

	


