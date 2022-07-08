package Q10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringFuritsTest {
    @Test
    public void test() {
        assertEquals("Apple-orange-banana-lemon",StringFurits.concatString(new String[]{"Apple", "orange","banana","lemon"}));
    }

}


