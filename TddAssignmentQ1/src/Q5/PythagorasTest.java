package Q5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PythagorasTest {
	@Test
    public void test() {
        assertEquals(true,Pythagoras.pythagoras(6,8,10));
    }
    @Test
    public void test1() {
        assertEquals(true,Pythagoras.pythagoras(2,8,10));
    }
	

}
