package example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {
	static A objitem;
	@BeforeClass
	public static void setUpBeforeClass() {
		objitem=new A();
		objitem.setCatname("shirts");
		objitem.setIname("shirt");

		objitem.setPrice(560);

		
	}
	@Test
	public void itemShirtsTest() {
		assertEquals("REd Shirt",objitem.getIname().toUpperCase());
	}
}

