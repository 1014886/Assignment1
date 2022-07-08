package Q1;



import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCase {
	@Test
	public void TestGetHCF() {
		System.out.println("test case of HCF");
	   assertEquals(12, HcfOfTwoNumber.getHCF(36, 60));
	}
}

