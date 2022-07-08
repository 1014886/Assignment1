package Q15;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {
    @Test
    public void test() throws Exception {
        assertEquals(true,Que15item.checkItem(111,"milk",20,25.50,"30/03/2021","30/06/2022"));
    }

}
