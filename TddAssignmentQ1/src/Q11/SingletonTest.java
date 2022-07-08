package Q11;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingleton() {
         
    	SingletonClassOrNot instance1 = SingletonClassOrNot.getInstance();
    	SingletonClassOrNot instance2 = SingletonClassOrNot.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);
         
    }
 
}