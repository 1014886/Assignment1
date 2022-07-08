package Q3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
    @Test
    public void test() {
        assertEquals(true,UserPass.checkEmailandPassword("swapnil@gmail.com", "swapnil23"));
    }

}


