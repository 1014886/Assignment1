package Q8;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Q7.PalindromeNumber;

public class ArrayEvenTest {
	@Test
	public void test() {
		
		assertEquals(4, ArrayEven.even(new int[] {2,4,1,9,34,3,1,4,5}));
	}

}


