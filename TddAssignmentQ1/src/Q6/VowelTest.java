package Q6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelTest {
	@Test
    public void test() {
        assertEquals(true,Vowel.vowelCount("Neha"));
    }
    @Test
    public void test1() {
        assertEquals(true,Vowel.vowelCount("Om"));
    }

}
