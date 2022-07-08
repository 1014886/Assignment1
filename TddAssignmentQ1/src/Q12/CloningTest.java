package Q12;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CloningTest {

    @Test
      public void test1() throws CloneNotSupportedException {
    	Clone s1 = new Clone (101,"nitin");
           Clone s2 = (Clone)s1.clone();


           assertEquals(true,Clone.checkClone(s1, s2));

       }

   
}