package Q8;

import java.util.Arrays;

public class ArrayEven {
	
	public static int even(int a[]) {
		
		int count=0;
		System.out.println("even number:");
		for(int i=0;i<9;i++) {
			
			if(a[i] % 2 == 0) {
				System.out.println(a[i]+" ");
				count++;
			}
		}
		return count;
		
	}
}
	
