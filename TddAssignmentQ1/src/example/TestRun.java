package example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class TestRun {
	@Test
	public void testOnProd() {
		System.setProperty("test","no test");
		assertFalse("test".equals(System.getProperty("test")));
		assumeTrue("no test".equals(System.getProperty("no test")));
		
	}

}
