package com.yash.spring_core_assignment_.Q6;

import java.util.List;

import javax.annotation.PostConstruct;

public class Vowel {
	String str[];

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	public void show() {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	public void result() {
		for(String a:str) {
			String str1=a.replaceAll("[aeiouAEIOU]", "");
			if(a.equals(str1)) {
				System.out.println(a);
			}
			
		}
	}
}


	
