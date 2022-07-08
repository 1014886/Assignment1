package Q13;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculTest {
	@Test
	public void add() {
		assertEquals(38, Calculator.add(15, 23));
		
	}
	@Test
	public void sub() {
		assertEquals(-10, Calculator.substract(100,110));
	}
	@Test
	public void mul() {
		assertEquals(1500, Calculator.multiply(15, 100));
	}
	@Test
	public void mod() {
		assertEquals(5, Calculator.modulus(15, 10));
	}
	@Test
	public void pow() {
		assertEquals(25, Calculator.power(5, 2));

	try {
		assertEquals(25, Calculator.power(5, -1));
		
	}catch(IllegalArgumentException e) {
		System.out.println("This line will not be Executed");
		System.out.println("In the catch block due to Exception="+e);
	}
		
	}
	@Test
	public void sqrt() {
		assertEquals(5, Calculator.squareroot(25));
	}
	@Test
	public void cube() {
		assertEquals(2, Calculator.cuberoot(8));
	}
	@Test
	public void testExceptionThrown() {
		Calculator  test=new Calculator();
		
		assertEquals(2, Calculator.divide(4, 2));
		try {
			assertEquals(2, Calculator.divide(100, 0));
		}catch(ArithmeticException e) {
			System.out.println("This line will not be Executed");
			System.out.println("In the catch block due to Exception="+e);
				
		}
	}
	@Test
	public void TestExceptionThrown2() {
	Calculator cal=new Calculator();
	assertEquals(0, Calculator.modulus(4, 2));
	try {
		assertEquals(2, Calculator.modulus(100, 0));
	}catch(ArithmeticException e){
		System.out.println("This line will not be Executed");
		System.out.println("In the catch block due to Exception="+e);
		
	}
}
}
