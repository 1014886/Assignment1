package com.yash;

interface Maximum{
	void findmax();
}

public class MaxArrayQ12 {

	public static void main(String[] args) {
		Maximum obj= ()->{
			int a[]= { 45,76,88,34,56};
			int max =a[0];
			
			for(int i=1;i<a.length;i++) {
				
				if(a[i]>max) {
					
					max=a[i];
				}
			}
		System.out.println("Maximum number :-" +max);

	};
	obj.findmax();
	}

}
