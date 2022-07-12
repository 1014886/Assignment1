package com.yash.spring_core_assignment_.Q15;

public class Category {
	
int catid;
String Catname;

public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return Catname;
}
public void setCatname(String catname) {
	Catname = catname;
}
@Override
public String toString() {
	return "\n Category [catid=" + catid + ", Catname=" + Catname + "]";
}



}


